.class public final synthetic Ldi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldi4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldi4;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

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
    iget v0, p0, Ldi4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Ldi4;->b:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    new-instance v0, Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v3, "ARTIST_OBJECT"

    .line 21
    .line 22
    invoke-virtual {v0, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 36
    .line 37
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lau;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const v2, 0x7f0a00e2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2, v0, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const v0, 0x7f13053b

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-virtual {p0}, Lzt;->h0()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 78
    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    new-instance v0, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v3, "ALBUM_OBJECT"

    .line 87
    .line 88
    invoke-virtual {v0, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 89
    .line 90
    .line 91
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 92
    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 100
    .line 101
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 102
    .line 103
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Lau;

    .line 106
    .line 107
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const v2, 0x7f0a009f

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2, v0, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const v0, 0x7f13053a

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-virtual {p0}, Lzt;->h0()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 144
    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v1, "clipboard"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroid/content/ClipboardManager;

    .line 158
    .line 159
    const v1, 0x7f130056

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getUrl()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 178
    .line 179
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Lba2;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lzt;->h0()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_4
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const v0, 0x7f130526

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lzt;->h0()V

    .line 209
    .line 210
    .line 211
    :goto_2
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
