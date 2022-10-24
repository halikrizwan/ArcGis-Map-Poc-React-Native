package main.java.com.arcgismappoc;

import com.facebook.react.uimanager.SimpleViewManager;
import android.view.TextureView;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.widget.TextView;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.BasemapStyle;
import com.esri.arcgisruntime.mapping.Viewpoint;
import com.esri.arcgisruntime.mapping.view.MapView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.esri.arcgisruntime.data.ServiceFeatureTable;
import com.esri.arcgisruntime.layers.FeatureLayer;
import com.esri.arcgisruntime.layers.ArcGISMapImageLayer;
import android.os.Bundle;

public class RNCSTMMapManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "RNCSTMMap";
    public static final String ComponentTag = "RNCSTMMap";
    ReactApplicationContext mCallerContext;
    private MapView mMapView;

    public RNCSTMMapManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
        mMapView = new MapView(reactContext);
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext context) {
        ArcGISRuntimeEnvironment.setApiKey(
                "AAPK40231d9f0d1d45b4aa3839e4c132c485qENxOTNgsiVbCh0lcg96qO6VvJkO-Q7Co-3cQkTFkE0ivog6QaXQ9QjKJnUQb3Ms");
        ArcGISMapImageLayer mapImageLayer = new ArcGISMapImageLayer(
                "https://services.gisqatar.org.qa/server/rest/services/Vector/Qatar_StreetMap_Hybrid_E/MapServer");
        ArcGISMap map = new ArcGISMap();
        map.getOperationalLayers().add(mapImageLayer);
        mMapView.setMap(map);
        return mMapView;
    }

}
