package set.www.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class AdapterEmail extends RecyclerView.Adapter<AdapterEmail.AdapatEmailView> {

    private Context context;
    private List<DataEmail> dataEmailList;

    public AdapterEmail(Context context, List<DataEmail> dataEmailList) {
        this.dataEmailList = dataEmailList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapatEmailView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_format, null);
        return new AdapatEmailView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapatEmailView holder, final int position) {
        final DataEmail dataEmail = dataEmailList.get(position);

        holder.nama.setText(dataEmail.getNama());
        holder.subjek.setText(dataEmail.getSubjek());
        holder.isi.setText(dataEmail.getIsi());
        holder.waktu.setText(dataEmail.getWaktu());
        holder.inisial.setText(dataEmail.getInisial());
        holder.inisial.setBackgroundResource(dataEmail.getInialbackground());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view.findViewById(R.id.parentLayout), "Email Dari " + dataEmail.getNama(), Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataEmailList.size();
    }

    public class AdapatEmailView extends RecyclerView.ViewHolder {

        TextView nama, subjek, isi;
        ImageView profil;
        LinearLayout parentLayout;
        TextView waktu;
        TextView inisial;

        @SuppressLint("NewApi")
        public AdapatEmailView(@NonNull View itemView) {
            super(itemView);

            nama = (TextView) itemView.findViewById(R.id.nama);
            subjek = (TextView) itemView.findViewById(R.id.subjek);
            isi = (TextView) itemView.findViewById(R.id.isi);
            inisial = (TextView) itemView.findViewById(R.id.inisial);
            waktu = (TextView) itemView.findViewById(R.id.waktu);
            parentLayout = (LinearLayout) itemView.findViewById(R.id.parentLayout);

        }
    }

}
