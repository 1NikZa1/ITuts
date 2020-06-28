package fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nikza.ituts.R;

public class MaterialsFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static MaterialsFragment getInstance(Context context){
        Bundle args = new Bundle();
        MaterialsFragment fragment = new MaterialsFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_materials));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);



        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
