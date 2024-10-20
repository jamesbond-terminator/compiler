<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/top_view"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:layout_alignBottom="@+id/textview"
        android:layout_marginBottom="-122dp"
        android:background="@drawable/bg_view" />

    <FrameLayout
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_alignParentEnd="true"
        android:layout_alignParentTop="true"
        android:clickable="true"
        android:layout_marginTop="20dp"
        android:focusable="true">

        <ImageView
            android:id="@+id/notificationIcon"
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:contentDescription="Notification icon"
            android:src="@drawable/bell" />
    </FrameLayout>


    <GridLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:rowCount="4"
        android:columnCount="2"
        android:layout_marginLeft="24dp"
        android:layout_marginRight="24dp"
        android:layout_marginTop="16dp"
        android:layout_below="@id/top_view">
        
        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:id="@+id/book"
            android:orientation="vertical">
    
            <ImageView
                android:layout_width="100dp"
                android:layout_height="100dp"
                android:src="@drawable/book"
                android:layout_gravity="center_horizontal" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="BOOKS"
                android:layout_gravity="center_horizontal"
                android:textSize="18sp"
                android:textStyle="bold"
                android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:id="@+id/course"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:src="@drawable/youtube"
                    android:layout_gravity="center_horizontal" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Y-CLASS"
                    android:layout_gravity="center_horizontal"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:id="@+id/result"
            android:orientation="vertical">

                <ImageView
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:src="@drawable/results"
                    android:layout_gravity="center_horizontal" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="RESULTS"
                    android:layout_gravity="center_horizontal"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:id="@+id/paper"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:src="@drawable/question"
                    android:layout_gravity="center_horizontal" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Q-PAPER"
                    android:layout_gravity="center_horizontal"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:id="@+id/time"
            android:orientation="vertical">

                <ImageView
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:src="@drawable/time"
                    android:layout_gravity="center_horizontal" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="T-TABLE"
                    android:layout_gravity="center_horizontal"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:layout_width="0dp"
            android:layout_height="150dp"
            app:cardCornerRadius="15dp"
            android:layout_margin="8dp"
            app:cardElevation="12dp"
            android:layout_columnWeight="1">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:gravity="center"
                android:id="@+id/chat"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="100dp"
                    android:layout_height="100dp"
                    android:src="@drawable/openchat"
                    android:layout_gravity="center_horizontal" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="OP-CHAT"
                    android:layout_gravity="center_horizontal"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="@color/black"/>
            </LinearLayout>
        </androidx.cardview.widget.CardView>
    </GridLayout>



        <TextView
            android:id="@+id/textview"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="DashBoard"
            android:textColor="@color/white"
            android:textSize="36sp"
            android:textStyle="bold"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="30dp"
            />

        <ImageView
            android:layout_width="25dp"
            android:layout_height="25dp"
            android:src="@drawable/baseline_density_medium_24"
            android:layout_marginTop="45dp"
            android:layout_marginLeft="20dp" />


    </RelativeLayout>
