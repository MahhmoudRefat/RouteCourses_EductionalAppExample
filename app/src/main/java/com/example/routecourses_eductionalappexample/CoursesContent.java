package com.example.routecourses_eductionalappexample;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
public class CoursesContent implements Parcelable {
    int img_id;
    String content;

    public CoursesContent() {
    }

    public CoursesContent(int img_id, String content) {
        this.img_id = img_id;
        this.content = content;
    }

    protected CoursesContent(Parcel in) {
        img_id = in.readInt();
        content = in.readString();
    }

    public static final Creator<CoursesContent> CREATOR = new Creator<CoursesContent>() {
        @Override
        public CoursesContent createFromParcel(Parcel in) {
            return new CoursesContent(in);
        }

        @Override
        public CoursesContent[] newArray(int size) {
            return new CoursesContent[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(img_id);
        parcel.writeString(content);
    }
}
