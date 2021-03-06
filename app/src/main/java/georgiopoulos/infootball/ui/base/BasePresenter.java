/**
 * Copyright 2017 georgiopoulos kyriakos
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * <b>Presenter’s lifecycle:<b/>
 * <p>
 * void onCreate(Bundle savedState) - is called on every presenter’s creation.
 * <p>
 * void onDestroy() - is called when a View becomes destroyed not because of configuration change.
 * <p>
 * void onSave(Bundle state) - is called during View’s onSaveInstanceState to persist Presenter’s
 * state as well.
 * <p>
 * void onTakeView(ViewType view) - is called during Activity’s or Fragment’s onResume(),
 * or during android.view.View#onAttachedToWindow().
 * <p>
 * void onDropView() - is called during Activity’s onDestroy() or Fragment’s onDestroyView(),
 * or during android.view.View#onDetachedFromWindow().
 * <p>
 * Presenter uses deliverLatestCache() operation that delays all data and errors that has been
 * emitted by a data source until a view becomes available. It also caches data in memory so it
 * can be reused on configuration change.
 * </p>
 */

package georgiopoulos.infootball.ui.base;

import android.os.Bundle;

import java.util.List;

import icepick.Icepick;
import nucleus.presenter.RxPresenter;

public class BasePresenter<ViewType> extends RxPresenter<ViewType> {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        Icepick.restoreInstanceState(this, savedState);
    }

    @Override
    protected void onSave(Bundle state) {
        super.onSave(state);
        Icepick.saveInstanceState(this, state);
    }

    public boolean isNullOrEmpty(List<?> list){
        return (list == null || list.isEmpty());
    }
}