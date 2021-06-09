package com.dicoding.handchat

import android.os.Parcel
import android.os.Parcelable

data class Dictionary (
        var name: String? = "",
        var avatar: Int = 0
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString().toString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(avatar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Dictionary> {
        override fun createFromParcel(parcel: Parcel): Dictionary {
            return Dictionary(parcel)
        }

        override fun newArray(size: Int): Array<Dictionary?> {
            return arrayOfNulls(size)
        }
    }
}