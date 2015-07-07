package com.coditron.project.adminsearchrestaurant.Views.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coditron.project.adminsearchrestaurant.R;


/**
 * Fragmento para el contenido principal
 */
public class PlaceholderFragment extends Fragment {
    /**
     * Este argumento del fragmento representa el título de cada
     * sección
     */
    public static final String ARG_SECTION_TITLE = "section_number";


    /**
     * Crea una instancia prefabricada de {@link PlaceholderFragment}
     *
     * @param sectionTitle Título usado en el contenido
     * @return Instancia dle fragmento
     */
    public static PlaceholderFragment newInstance(String sectionTitle) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.section_fragment, container, false);

        // Ubicar argumento en el text view de section_fragment.xml
        String title = getArguments().getString(ARG_SECTION_TITLE);
        TextView titulo = (TextView) view.findViewById(R.id.title);
        titulo.setText(title);
        switch (title){
            /*//Solo admin
            case 0: break;
            case 1: break;
            //Opciones para todos
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;*/
            case "Perfil":
                Fragment fragmentProfile = new ProfileFragment(title);
                if (fragmentProfile!=null){
                    FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                    fragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_main_content, fragmentProfile)
                            .commit();
                }else {
                    Log.e("ProfileFragment", "failed created fragment");
                }

            //case 10: break;
            /*case "Editar":
                Fragment fragmentEditBasicInfo = new BasicInfoFragment();
                if (fragmentEditBasicInfo!=null){
                    FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                    fragmentManager
                            .beginTransaction()
                            .replace(R.id.frame_main_content,fragmentEditBasicInfo)
                            .commit();
                }else{
                    Log.e("BasicInfoFragment","failed create fragment");
                }*/

        }
        return view;
    }


}