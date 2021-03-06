/*
 * Copyright 2017 Gregory P. Moyer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.syphr.lametrictime.api.local.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "brightness", "brightness_mode", "height", "screensaver", "type", "width" })
public class Display
{
    @JsonProperty("brightness")
    private Integer brightness;
    @JsonProperty("brightness_mode")
    private BrightnessMode brightnessMode;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("screensaver")
    private Screensaver screensaver;
    @JsonProperty("type")
    private DisplayType type;
    @JsonProperty("width")
    private Integer width;

    @JsonProperty("brightness")
    public Integer getBrightness()
    {
        return brightness;
    }

    @JsonProperty("brightness")
    public void setBrightness(Integer brightness)
    {
        this.brightness = brightness;
    }

    public Display withBrightness(Integer brightness)
    {
        this.brightness = brightness;
        return this;
    }

    @JsonProperty("brightness_mode")
    public BrightnessMode getBrightnessMode()
    {
        return brightnessMode;
    }

    @JsonProperty("brightness_mode")
    public void setBrightnessMode(BrightnessMode brightnessMode)
    {
        this.brightnessMode = brightnessMode;
    }

    public Display withBrightnessMode(BrightnessMode brightnessMode)
    {
        this.brightnessMode = brightnessMode;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight()
    {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public Display withHeight(Integer height)
    {
        this.height = height;
        return this;
    }

    @JsonProperty("screensaver")
    public Screensaver getScreensaver()
    {
        return screensaver;
    }

    @JsonProperty("screensaver")
    public void setScreensaver(Screensaver screensaver)
    {
        this.screensaver = screensaver;
    }

    public Display withScreensaver(Screensaver screensaver)
    {
        this.screensaver = screensaver;
        return this;
    }

    @JsonProperty("type")
    public DisplayType getType()
    {
        return type;
    }

    @JsonProperty("type")
    public void setType(DisplayType type)
    {
        this.type = type;
    }

    public Display withType(DisplayType type)
    {
        this.type = type;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth()
    {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Display withWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Display [brightness=");
        builder.append(brightness);
        builder.append(", brightnessMode=");
        builder.append(brightnessMode);
        builder.append(", height=");
        builder.append(height);
        builder.append(", screensaver=");
        builder.append(screensaver);
        builder.append(", type=");
        builder.append(type);
        builder.append(", width=");
        builder.append(width);
        builder.append("]");
        return builder.toString();
    }
}
