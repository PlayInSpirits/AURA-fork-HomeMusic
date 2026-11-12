.class public final Leu3;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lup0;

.field public C0:Lgu3;

.field public final D0:Lcom/eddyizm/tempus/interfaces/RadioCallback;

.field public E0:Ljava/lang/String;

.field public F0:Ljava/lang/String;

.field public G0:Ljava/lang/String;

.field public H0:Ljava/lang/String;

.field public I0:Landroid/widget/PopupWindow;

.field public J0:Lw12;

.field public final K0:Ljava/util/ArrayList;

.field public L0:Lzd0;

.field public M0:Landroid/widget/ArrayAdapter;

.field public N0:Z


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/RadioCallback;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Leu3;->K0:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Leu3;->D0:Lcom/eddyizm/tempus/interfaces/RadioCallback;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Lpp0;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Leu3;->B0:Lup0;

    .line 13
    .line 14
    return-void
.end method

.method public final R()V
    .locals 3

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Leu3;->C0:Lgu3;

    .line 5
    .line 6
    iget-object v0, v0, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 11
    .line 12
    iget-object v1, v1, Lup0;->f:Landroid/view/View;

    .line 13
    .line 14
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 24
    .line 25
    iget-object v1, v1, Lup0;->g:Landroid/view/View;

    .line 26
    .line 27
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getStreamUrl()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 37
    .line 38
    iget-object v1, v1, Lup0;->e:Landroid/view/View;

    .line 39
    .line 40
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getHomePageUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 50
    .line 51
    iget-object v1, v1, Lup0;->b:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    const/16 v2, 0x8

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 59
    .line 60
    iget-object v1, v1, Lup0;->i:Landroid/view/View;

    .line 61
    .line 62
    check-cast v1, Landroid/widget/ImageButton;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Leu3;->C0:Lgu3;

    .line 68
    .line 69
    iget-boolean v1, v1, Lgu3;->e:Z

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 75
    .line 76
    iget-object v1, v1, Lup0;->c:Landroid/view/View;

    .line 77
    .line 78
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Leu3;->B0:Lup0;

    .line 84
    .line 85
    iget-object v1, v1, Lup0;->d:Landroid/view/View;

    .line 86
    .line 87
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getCoverArt()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    check-cast v0, Lf9;

    .line 101
    .line 102
    const/4 v1, -0x3

    .line 103
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    :cond_1
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 113
    .line 114
    instance-of v1, v0, Lf9;

    .line 115
    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    check-cast v0, Lf9;

    .line 119
    .line 120
    const/4 v1, -0x1

    .line 121
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    new-instance v1, Lau3;

    .line 128
    .line 129
    const/4 v2, 0x1

    .line 130
    invoke-direct {v1, p0, v2}, Lau3;-><init>(Leu3;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d004a

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x7f0a0312

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    move-object v6, v3

    .line 22
    check-cast v6, Lcom/google/android/material/textfield/TextInputLayout;

    .line 23
    .line 24
    if-eqz v6, :cond_5

    .line 25
    .line 26
    const v0, 0x7f0a0313

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v7, v3

    .line 34
    check-cast v7, Lcom/google/android/material/textfield/TextInputEditText;

    .line 35
    .line 36
    if-eqz v7, :cond_5

    .line 37
    .line 38
    const v0, 0x7f0a0315

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 46
    .line 47
    if-eqz v3, :cond_5

    .line 48
    .line 49
    const v0, 0x7f0a0316

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v8, v3

    .line 57
    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    .line 58
    .line 59
    if-eqz v8, :cond_5

    .line 60
    .line 61
    const v0, 0x7f0a0319

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 69
    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    const v0, 0x7f0a031a

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    move-object v9, v3

    .line 80
    check-cast v9, Lcom/google/android/material/textfield/TextInputEditText;

    .line 81
    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    const v0, 0x7f0a031d

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    const v0, 0x7f0a031e

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    move-object v10, v3

    .line 103
    check-cast v10, Lcom/google/android/material/textfield/TextInputEditText;

    .line 104
    .line 105
    if-eqz v10, :cond_5

    .line 106
    .line 107
    const v0, 0x7f0a0506

    .line 108
    .line 109
    .line 110
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    const v0, 0x7f0a0507

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 126
    .line 127
    if-eqz v3, :cond_5

    .line 128
    .line 129
    const v3, 0x7f0a0508

    .line 130
    .line 131
    .line 132
    invoke-static {p1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    move-object v11, v4

    .line 137
    check-cast v11, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 138
    .line 139
    if-eqz v11, :cond_4

    .line 140
    .line 141
    const v3, 0x7f0a053c

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    move-object v12, v4

    .line 149
    check-cast v12, Landroid/widget/ImageButton;

    .line 150
    .line 151
    if-eqz v12, :cond_4

    .line 152
    .line 153
    const v3, 0x7f0a05a4

    .line 154
    .line 155
    .line 156
    invoke-static {p1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    move-object v13, v4

    .line 161
    check-cast v13, Landroid/widget/LinearLayout;

    .line 162
    .line 163
    if-eqz v13, :cond_4

    .line 164
    .line 165
    new-instance v4, Lup0;

    .line 166
    .line 167
    move-object v5, p1

    .line 168
    check-cast v5, Landroid/widget/LinearLayout;

    .line 169
    .line 170
    invoke-direct/range {v4 .. v13}, Lup0;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/button/MaterialButtonToggleGroup;Landroid/widget/ImageButton;Landroid/widget/LinearLayout;)V

    .line 171
    .line 172
    .line 173
    iput-object v4, p0, Leu3;->B0:Lup0;

    .line 174
    .line 175
    invoke-virtual {p0}, Lkc1;->d()Le75;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p0}, Lgh0;->r(Lf75;)Lb75;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {p0}, Lgh0;->q(Lf75;)Ltf0;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v5, Lbq4;

    .line 194
    .line 195
    invoke-direct {v5, p1, v3, v4}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 196
    .line 197
    .line 198
    const-class p1, Lgu3;

    .line 199
    .line 200
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    if-eqz v3, :cond_3

    .line 209
    .line 210
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 211
    .line 212
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v5, p1, v1}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Lgu3;

    .line 221
    .line 222
    iput-object p1, p0, Leu3;->C0:Lgu3;

    .line 223
    .line 224
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 225
    .line 226
    const/4 v1, 0x1

    .line 227
    if-eqz p1, :cond_1

    .line 228
    .line 229
    const-string v3, "INTERNET_RADIO_STATION_OBJECT"

    .line 230
    .line 231
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-eqz p1, :cond_1

    .line 236
    .line 237
    iget-object p1, p0, Leu3;->C0:Lgu3;

    .line 238
    .line 239
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 248
    .line 249
    iput-object v3, p1, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 250
    .line 251
    if-eqz v3, :cond_0

    .line 252
    .line 253
    iget-object v4, p1, Lgu3;->c:Lhh3;

    .line 254
    .line 255
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    if-eqz v3, :cond_0

    .line 263
    .line 264
    const-string v4, "local_"

    .line 265
    .line 266
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_0

    .line 271
    .line 272
    move v3, v1

    .line 273
    goto :goto_0

    .line 274
    :cond_0
    move v3, v2

    .line 275
    :goto_0
    iput-boolean v3, p1, Lgu3;->e:Z

    .line 276
    .line 277
    :cond_1
    iget-object p1, p0, Leu3;->C0:Lgu3;

    .line 278
    .line 279
    iget-object p1, p1, Lgu3;->f:Lk03;

    .line 280
    .line 281
    new-instance v3, Lbu3;

    .line 282
    .line 283
    invoke-direct {v3, p0, v2}, Lbu3;-><init>(Leu3;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, p0, v3}, Lad2;->e(Lba2;La83;)V

    .line 287
    .line 288
    .line 289
    iget-object p1, p0, Leu3;->C0:Lgu3;

    .line 290
    .line 291
    iget-object p1, p1, Lgu3;->g:Lk03;

    .line 292
    .line 293
    new-instance v3, Lbu3;

    .line 294
    .line 295
    invoke-direct {v3, p0, v1}, Lbu3;-><init>(Leu3;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, p0, v3}, Lad2;->e(Lba2;La83;)V

    .line 299
    .line 300
    .line 301
    iget-object p1, p0, Leu3;->C0:Lgu3;

    .line 302
    .line 303
    iget-object p1, p1, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 304
    .line 305
    iget-object v3, p0, Leu3;->B0:Lup0;

    .line 306
    .line 307
    if-eqz p1, :cond_2

    .line 308
    .line 309
    iget-object p1, v3, Lup0;->b:Landroid/widget/LinearLayout;

    .line 310
    .line 311
    const/16 v0, 0x8

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 314
    .line 315
    .line 316
    iget-object p1, p0, Leu3;->B0:Lup0;

    .line 317
    .line 318
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 319
    .line 320
    check-cast p1, Landroid/widget/ImageButton;

    .line 321
    .line 322
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 323
    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_2
    iget-object p1, v3, Lup0;->b:Landroid/widget/LinearLayout;

    .line 327
    .line 328
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 329
    .line 330
    .line 331
    iget-object p1, p0, Leu3;->B0:Lup0;

    .line 332
    .line 333
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 334
    .line 335
    check-cast p1, Landroid/widget/ImageButton;

    .line 336
    .line 337
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 338
    .line 339
    .line 340
    iget-object p1, p0, Leu3;->B0:Lup0;

    .line 341
    .line 342
    iget-object p1, p1, Lup0;->h:Landroid/view/View;

    .line 343
    .line 344
    check-cast p1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 345
    .line 346
    new-instance v3, Lcu3;

    .line 347
    .line 348
    invoke-direct {v3, p0}, Lcu3;-><init>(Leu3;)V

    .line 349
    .line 350
    .line 351
    iget-object p1, p1, Lcom/google/android/material/button/MaterialButtonToggleGroup;->p:Ljava/util/LinkedHashSet;

    .line 352
    .line 353
    invoke-virtual {p1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    iget-object p1, p0, Leu3;->B0:Lup0;

    .line 357
    .line 358
    iget-object p1, p1, Lup0;->h:Landroid/view/View;

    .line 359
    .line 360
    check-cast p1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 361
    .line 362
    invoke-virtual {p1, v0, v1}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->b(IZ)V

    .line 363
    .line 364
    .line 365
    :goto_1
    iget-object p1, p0, Leu3;->B0:Lup0;

    .line 366
    .line 367
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 368
    .line 369
    check-cast p1, Landroid/widget/ImageButton;

    .line 370
    .line 371
    new-instance v0, Lau3;

    .line 372
    .line 373
    const/4 v1, 0x2

    .line 374
    invoke-direct {v0, p0, v1}, Lau3;-><init>(Leu3;I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 378
    .line 379
    .line 380
    new-instance p1, Lvg2;

    .line 381
    .line 382
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-direct {p1, v0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 387
    .line 388
    .line 389
    iget-object v0, p0, Leu3;->B0:Lup0;

    .line 390
    .line 391
    iget-object v0, v0, Lup0;->a:Landroid/view/ViewGroup;

    .line 392
    .line 393
    check-cast v0, Landroid/widget/LinearLayout;

    .line 394
    .line 395
    invoke-virtual {p1, v0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    const v0, 0x7f13042c

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1, v0}, Lvg2;->p(I)V

    .line 403
    .line 404
    .line 405
    new-instance v0, Lwr;

    .line 406
    .line 407
    const/4 v1, 0x3

    .line 408
    invoke-direct {v0, v1}, Lwr;-><init>(I)V

    .line 409
    .line 410
    .line 411
    const v1, 0x7f13042b

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1, v1, v0}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance v0, Lvr;

    .line 419
    .line 420
    const/4 v1, 0x6

    .line 421
    invoke-direct {v0, v1, p0}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    const p0, 0x7f13042a

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, p0, v0}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 428
    .line 429
    .line 430
    new-instance p0, Lwr;

    .line 431
    .line 432
    const/16 v0, 0x9

    .line 433
    .line 434
    invoke-direct {p0, v0}, Lwr;-><init>(I)V

    .line 435
    .line 436
    .line 437
    const v0, 0x7f130429

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, v0, p0}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    return-object p0

    .line 449
    :cond_3
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 450
    .line 451
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v1

    .line 455
    :cond_4
    move v0, v3

    .line 456
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    const-string p1, "Missing required view with ID: "

    .line 465
    .line 466
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    return-object v1
.end method

.method public final n0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Leu3;->L0:Lzd0;

    .line 2
    .line 3
    iget-object v0, v0, Lzd0;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Leu3;->J0:Lw12;

    .line 12
    .line 13
    iget-object v0, v0, Lw12;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/widget/ProgressBar;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Leu3;->J0:Lw12;

    .line 22
    .line 23
    iget-object v0, v0, Lw12;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/widget/TextView;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-string v1, "votes"

    .line 37
    .line 38
    const/16 v2, 0x1e

    .line 39
    .line 40
    const-string v3, "RadioBrowserClient"

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    invoke-static {}, Lvt3;->a()Lvt3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v5, "searchAdvanced: name="

    .line 60
    .line 61
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v5, " country="

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    new-instance v3, Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_1

    .line 92
    .line 93
    const-string v4, "name"

    .line 94
    .line 95
    invoke-virtual {v3, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_2

    .line 103
    .line 104
    const-string p1, "country"

    .line 105
    .line 106
    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_2
    const-string p1, "limit"

    .line 110
    .line 111
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    const-string p1, "order"

    .line 119
    .line 120
    invoke-virtual {v3, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    const-string p1, "reverse"

    .line 124
    .line 125
    const-string p2, "true"

    .line 126
    .line 127
    invoke-virtual {v3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    iget-object p1, v0, Lvt3;->a:Lwt3;

    .line 131
    .line 132
    invoke-interface {p1, v3}, Lwt3;->b(Ljava/util/Map;)Lretrofit2/Call;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v4, 0x1

    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    invoke-static {}, Lvt3;->a()Lvt3;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    const-string v0, "searchByCountryExact: "

    .line 152
    .line 153
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    iget-object p1, p1, Lvt3;->a:Lwt3;

    .line 161
    .line 162
    invoke-interface {p1, p2, v2, v1, v4}, Lwt3;->d(Ljava/lang/String;ILjava/lang/String;Z)Lretrofit2/Call;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    goto :goto_0

    .line 167
    :cond_4
    invoke-static {}, Lvt3;->a()Lvt3;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    const-string v0, "searchByName: "

    .line 175
    .line 176
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    iget-object p2, p2, Lvt3;->a:Lwt3;

    .line 184
    .line 185
    invoke-interface {p2, p1, v2, v1, v4}, Lwt3;->c(Ljava/lang/String;ILjava/lang/String;Z)Lretrofit2/Call;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    :goto_0
    new-instance p2, Lom1;

    .line 190
    .line 191
    const/16 v0, 0x15

    .line 192
    .line 193
    invoke-direct {p2, v0, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final o0(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Leu3;->J0:Lw12;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string p1, ""

    .line 18
    .line 19
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Leu3;->K0:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :cond_2
    :goto_1
    if-ge v4, v2, :cond_4

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    check-cast v5, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iget-object p1, p0, Leu3;->M0:Landroid/widget/ArrayAdapter;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->clear()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Leu3;->M0:Landroid/widget/ArrayAdapter;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Leu3;->M0:Landroid/widget/ArrayAdapter;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    iget-object p1, p1, Lw12;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Landroid/widget/ListView;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Landroid/view/View;

    .line 91
    .line 92
    const/4 v1, 0x2

    .line 93
    new-array v2, v1, [I

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 96
    .line 97
    .line 98
    new-array p1, v1, [I

    .line 99
    .line 100
    iget-object v1, p0, Leu3;->J0:Lw12;

    .line 101
    .line 102
    iget-object v1, v1, Lw12;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 118
    .line 119
    const/high16 v4, 0x41800000    # 16.0f

    .line 120
    .line 121
    mul-float/2addr v1, v4

    .line 122
    float-to-int v1, v1

    .line 123
    iget-object v4, p0, Leu3;->J0:Lw12;

    .line 124
    .line 125
    iget-object v4, v4, Lw12;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Landroid/widget/ListView;

    .line 128
    .line 129
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 134
    .line 135
    const/4 v5, -0x1

    .line 136
    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 137
    .line 138
    const v5, 0x800033

    .line 139
    .line 140
    .line 141
    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 142
    .line 143
    aget p1, p1, v3

    .line 144
    .line 145
    aget v2, v2, v3

    .line 146
    .line 147
    sub-int/2addr p1, v2

    .line 148
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iput p1, v4, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 153
    .line 154
    iput v1, v4, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 155
    .line 156
    iget-object p1, p0, Leu3;->J0:Lw12;

    .line 157
    .line 158
    iget-object p1, p1, Lw12;->g:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Landroid/widget/ListView;

    .line 161
    .line 162
    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    iget-object p0, p0, Leu3;->J0:Lw12;

    .line 166
    .line 167
    iget-object p0, p0, Lw12;->g:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Landroid/widget/ListView;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    const/16 v3, 0x8

    .line 178
    .line 179
    :cond_6
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final p0()V
    .locals 1

    .line 1
    iget-object v0, p0, Leu3;->J0:Lw12;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Lw12;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Lhg;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object p0, p0, Leu3;->J0:Lw12;

    .line 26
    .line 27
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const v0, 0x7f08011c

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const v0, 0x7f080125

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
