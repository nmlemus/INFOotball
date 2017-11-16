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
 */
package georgiopoulos.infootball.data.remote.dto.league;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Events{

    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    /**
     * No args constructor for use in serialization
     */
    public Events(){
    }

    /**
     * @param events
     */
    public Events(List<Event> events){
        super(); this.events = events;
    }

    public List<Event> getEvents(){
        return events;
    }

    public void setEvents(List<Event> events){
        this.events = events;
    }

}