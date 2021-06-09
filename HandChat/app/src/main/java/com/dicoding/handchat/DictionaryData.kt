package com.dicoding.handchat

object DictionaryData {
    private val name = arrayOf(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z"
    )
    private val avatar = intArrayOf(
        R.drawable.aa,
        R.drawable.bb,
        R.drawable.cc,
        R.drawable.dd,
        R.drawable.ee,
        R.drawable.ff,
        R.drawable.gg,
        R.drawable.hh,
        R.drawable.ii,
        R.drawable.jj,
        R.drawable.kk,
        R.drawable.ll,
        R.drawable.m,
        R.drawable.nn,
        R.drawable.oo,
        R.drawable.pp,
        R.drawable.qq,
        R.drawable.rr,
        R.drawable.ss,
        R.drawable.tt,
        R.drawable.uu,
        R.drawable.vv,
        R.drawable.ww,
        R.drawable.xx,
        R.drawable.yy,
        R.drawable.zz

    )
    val listData: ArrayList<Dictionary>
        get() {
            val list = arrayListOf<Dictionary>()
            for (position in name.indices) {
                val personn = Dictionary()
                personn.name = name[position]
                personn.avatar = avatar[position]
                list.add(personn)
            }
            return list
        }
}