package com.h.h.criminallntent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HARI JEYACHANDRAN on 12/15/2017.
 */

public class crimeListFragment extends Fragment
{
    private RecyclerView rv;
    private CrimeAdapter a;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view= inflater.inflate(R.layout.fragment_crime_list,container,false);
        rv=(RecyclerView)view.findViewById(R.id.crime_recycler_view);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return rv;

    }
    private void updateUI()
    {
        crimeLab crimelab = crimeLab.get(getActivity());
        List<crime> crimes = crimeLab.getCrimelab();
        a =new CrimeAdapter(crimes);
        rv.setAdapter(a);
    }
    private class CrimeHolder extends RecyclerView.ViewHolder {
        public TextView mTitleTextView;
        public CrimeHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView.findViewById(R.id.tt);
        }
    }
    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {
        private List<crime> mCrimes;
        public CrimeAdapter(List<crime> crimes) {
            mCrimes = crimes;
        }

        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater
                    .inflate(R.layout.row, parent, false);
            CrimeHolder holder=new CrimeHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {
            crime c = mCrimes.get(position);
            holder.mTitleTextView.setText(c.getMtitle());

        }

        @Override
        public int getItemCount() {
            return mCrimes.size();
    }
    }
}
