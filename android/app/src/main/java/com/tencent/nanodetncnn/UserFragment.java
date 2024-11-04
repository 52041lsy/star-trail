package com.tencent.nanodetncnn;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UserFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.menu4, container, false);

        TextView ToSet=(TextView)view.findViewById(R.id.set);
        ToSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 使用 Fragment 的上下文创建 Intent
                Intent intent = new Intent(getActivity(), Detect.class);
                startActivity(intent);
            }
        });


        return view;
    }

}
