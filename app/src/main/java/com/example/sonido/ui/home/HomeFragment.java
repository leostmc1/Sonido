package com.example.sonido.ui.home;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sonido.R;

public class HomeFragment extends Fragment {
    VideoView video;
    ImageView eventos,intiraymi,calendario,foto,emergencia,ubicareventos;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        video = root.findViewById(R.id.video);
        eventos = root.findViewById(R.id.imageView5);
        intiraymi = root.findViewById(R.id.imageView3);
        calendario = root.findViewById(R.id.imageView6);
        foto = root.findViewById(R.id.imageView4);
        emergencia = root.findViewById(R.id.emergencia);
        ubicareventos = root.findViewById(R.id.imageView7);

        return root;
    }
}