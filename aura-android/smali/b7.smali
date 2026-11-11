.class public final synthetic Lb7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lb7;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lb7;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->F0:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->G0:Ljava/util/List;

    .line 25
    .line 26
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 27
    .line 28
    new-instance v0, Ly6;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->o0()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->I0:Lbl2;

    .line 44
    .line 45
    invoke-static {v0, p1, v3}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 53
    .line 54
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 55
    .line 56
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lau;

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lzt;->h0()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    new-instance v0, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v2, "ARTIST_OBJECT"

    .line 77
    .line 78
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const v2, 0x7f0a00e2

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2, v0, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const v0, 0x7f130043

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 108
    .line 109
    .line 110
    :goto_1
    invoke-virtual {p0}, Lzt;->h0()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 115
    .line 116
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->I0:Lbl2;

    .line 120
    .line 121
    const-string v1, "album"

    .line 122
    .line 123
    invoke-static {v0, p1, v3, v1}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 131
    .line 132
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 133
    .line 134
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Lau;

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lzt;->h0()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 146
    .line 147
    new-instance v0, Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v2, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 155
    .line 156
    .line 157
    const-string p1, "TRACKS_OBJECT"

    .line 158
    .line 159
    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 160
    .line 161
    .line 162
    new-instance p1, Lfl3;

    .line 163
    .line 164
    invoke-direct {p1}, Lfl3;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p1, v0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lzt;->h0()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_4
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 186
    .line 187
    if-eqz p1, :cond_2

    .line 188
    .line 189
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "clipboard"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Landroid/content/ClipboardManager;

    .line 200
    .line 201
    const v1, 0x7f130056

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getUrl()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 217
    .line 218
    .line 219
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 220
    .line 221
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Lba2;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lzt;->h0()V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_2
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    const v0, 0x7f130526

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lzt;->h0()V

    .line 251
    .line 252
    .line 253
    :goto_2
    return-void

    .line 254
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 255
    .line 256
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->I0:Lbl2;

    .line 257
    .line 258
    invoke-static {v0, p1, v2}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 266
    .line 267
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 268
    .line 269
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p1, Lau;

    .line 272
    .line 273
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0}, Lzt;->h0()V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
