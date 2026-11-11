.class public final synthetic Let1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Let1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Let1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Let1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Let1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Let1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, -0x1

    .line 5
    iget-object v2, p0, Let1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Let1;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Let1;->o:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lzk4;

    .line 16
    .line 17
    check-cast v3, Landroid/content/Context;

    .line 18
    .line 19
    check-cast v2, Lf9;

    .line 20
    .line 21
    iget-object p1, p0, Lzk4;->C0:Lhd;

    .line 22
    .line 23
    check-cast p1, Ldl4;

    .line 24
    .line 25
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v5, p1, Ldl4;->c:Lxi4;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v4, v4}, Lxi4;->s(IZZ)Lk03;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object p1, p1, Ldl4;->d:Lk03;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance v5, Lg7;

    .line 44
    .line 45
    invoke-direct {v5, p1, v4}, Lg7;-><init>(Lk03;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0, v5}, Lad2;->e(Lba2;La83;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance v0, Lyk4;

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-direct {v0, v3, v2, v1}, Lyk4;-><init>(Landroid/content/Context;Lf9;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0, v0}, Lad2;->e(Lba2;La83;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    check-cast p0, Lzk4;

    .line 66
    .line 67
    check-cast v3, Landroid/content/Context;

    .line 68
    .line 69
    check-cast v2, Lf9;

    .line 70
    .line 71
    iget-object p1, p0, Lzk4;->C0:Lhd;

    .line 72
    .line 73
    check-cast p1, Lcl4;

    .line 74
    .line 75
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v6, p1, Lcl4;->c:Lpa;

    .line 80
    .line 81
    invoke-virtual {v6, v1, v4}, Lpa;->y(IZ)Lk03;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v4, Ld8;

    .line 86
    .line 87
    const/16 v6, 0x1a

    .line 88
    .line 89
    invoke-direct {v4, v6, p1}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v5, v4}, Lad2;->e(Lba2;La83;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p1, Lcl4;->d:Lk03;

    .line 96
    .line 97
    new-instance v1, Lyk4;

    .line 98
    .line 99
    invoke-direct {v1, v3, v2, v0}, Lyk4;-><init>(Landroid/content/Context;Lf9;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p0, v1}, Lad2;->e(Lba2;La83;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_1
    check-cast p0, Lzk4;

    .line 107
    .line 108
    check-cast v3, Landroid/content/Context;

    .line 109
    .line 110
    check-cast v2, Lf9;

    .line 111
    .line 112
    iget-object p1, p0, Lzk4;->C0:Lhd;

    .line 113
    .line 114
    check-cast p1, Lbl4;

    .line 115
    .line 116
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v5, p1, Lbl4;->c:Lrv2;

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v4}, Lrv2;->o(IZ)Lk03;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v5, Ld8;

    .line 130
    .line 131
    const/16 v6, 0x19

    .line 132
    .line 133
    invoke-direct {v5, v6, p1}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0, v5}, Lad2;->e(Lba2;La83;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p1, Lbl4;->d:Lk03;

    .line 140
    .line 141
    new-instance v0, Lyk4;

    .line 142
    .line 143
    invoke-direct {v0, v3, v2, v4}, Lyk4;-><init>(Landroid/content/Context;Lf9;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p0, v0}, Lad2;->e(Lba2;La83;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 151
    .line 152
    check-cast v3, Ljava/lang/String;

    .line 153
    .line 154
    check-cast v2, Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-nez p1, :cond_0

    .line 161
    .line 162
    new-instance p1, Lcom/eddyizm/tempus/model/Download;

    .line 163
    .line 164
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 165
    .line 166
    invoke-direct {p1, v0}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v3}, Lcom/eddyizm/tempus/model/Download;->setPlaylistId(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v2}, Lcom/eddyizm/tempus/model/Download;->setPlaylistName(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 184
    .line 185
    invoke-static {v1}, Lgi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Lgn2;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, v1, p1, v4}, Leu0;->b(Lgn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 198
    .line 199
    invoke-static {p1, v0, v3, v2, v4}, Li51;->b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    :goto_0
    invoke-virtual {p0}, Lzt;->h0()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_3
    check-cast p0, Lad2;

    .line 207
    .line 208
    check-cast v3, Ld7;

    .line 209
    .line 210
    check-cast v2, Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 217
    .line 218
    if-nez p0, :cond_1

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_1
    sget-object p1, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 222
    .line 223
    if-eqz p1, :cond_2

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getContext()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    goto :goto_1

    .line 230
    :cond_2
    const/4 p1, 0x0

    .line 231
    :goto_1
    const-string v1, "liked"

    .line 232
    .line 233
    invoke-static {p1, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_4

    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-eqz v1, :cond_3

    .line 248
    .line 249
    move v1, v0

    .line 250
    goto :goto_2

    .line 251
    :cond_3
    move v1, v4

    .line 252
    :goto_2
    invoke-static {v0, p1, v1}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-nez p1, :cond_4

    .line 257
    .line 258
    invoke-virtual {v3, p0}, Ld7;->accept(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 276
    .line 277
    if-nez v0, :cond_5

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_5
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_6

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    sget-object v1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 292
    .line 293
    new-instance v2, Lct1;

    .line 294
    .line 295
    invoke-direct {v2, v0, p0, p1, v4}, Lct1;-><init>(Lcom/eddyizm/tempus/homemusic/SmartSession;Ljava/lang/String;Landroid/content/Context;I)V

    .line 296
    .line 297
    .line 298
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 299
    .line 300
    .line 301
    :goto_3
    return-void

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
