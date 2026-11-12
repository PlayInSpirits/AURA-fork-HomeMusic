.class public final synthetic Lsf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsf2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsf2;->b:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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
    .locals 10

    .line 1
    iget v0, p0, Lsf2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-wide/32 v3, 0x5265c00

    .line 6
    .line 7
    .line 8
    const-wide/16 v5, 0x0

    .line 9
    .line 10
    const-string v7, "server_unreachable"

    .line 11
    .line 12
    const v8, 0x7f130209

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lsf2;->b:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    sget v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->e0:I

    .line 24
    .line 25
    invoke-static {}, Lra0;->a()V

    .line 26
    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    invoke-static {}, Lud3;->u()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    sget-object p1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object p1, p1, Lqp4;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    add-long/2addr v0, v3

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    cmp-long p1, v0, v3

    .line 86
    .line 87
    if-gez p1, :cond_4

    .line 88
    .line 89
    new-instance p1, Lsa4;

    .line 90
    .line 91
    invoke-direct {p1}, Lsa4;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p1, p0, v2}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getOpenSubsonic()Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getOpenSubsonic()Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move v1, v9

    .line 120
    :goto_0
    invoke-static {v1}, Lud3;->p0(Z)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, Lio1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_1
    return-void

    .line 127
    :pswitch_0
    sget v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->e0:I

    .line 128
    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    invoke-static {}, Lra0;->a()V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Lud3;->u()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {p1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-nez p1, :cond_5

    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :cond_5
    sget-object p1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 151
    .line 152
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    iget-object p1, p1, Lqp4;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-virtual {p1, v8}, Landroid/widget/TextView;->setText(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    :cond_6
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_7

    .line 181
    .line 182
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string v0, "next_server_switch"

    .line 198
    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    invoke-interface {p1, v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Lud3;->H0()V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lcom/eddyizm/tempus/App;->d()Lpn4;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    sput-object p1, Lcom/eddyizm/tempus/App;->p:Lpn4;

    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->G()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Ll70;->d()Le75;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {p1}, Le75;->a()V

    .line 227
    .line 228
    .line 229
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 230
    .line 231
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p0, Lss0;

    .line 234
    .line 235
    iget-object p0, p0, Lss0;->q:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Lv23;

    .line 238
    .line 239
    invoke-virtual {p0}, Lv23;->g()Lr23;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iget p1, p1, Lr23;->u:I

    .line 244
    .line 245
    invoke-virtual {p0, p1, v1}, Lv23;->p(IZ)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, p1, v2, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_7
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-interface {p1, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 264
    .line 265
    .line 266
    move-result-wide v0

    .line 267
    add-long/2addr v0, v3

    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 269
    .line 270
    .line 271
    move-result-wide v3

    .line 272
    cmp-long p1, v0, v3

    .line 273
    .line 274
    if-gez p1, :cond_a

    .line 275
    .line 276
    new-instance p1, Lsa4;

    .line 277
    .line 278
    invoke-direct {p1}, Lsa4;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p1, p0, v2}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_8
    invoke-static {}, Lra0;->a()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getOpenSubsonic()Ljava/lang/Boolean;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-eqz v0, :cond_9

    .line 297
    .line 298
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getOpenSubsonic()Ljava/lang/Boolean;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-eqz p1, :cond_9

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_9
    move v1, v9

    .line 310
    :goto_2
    invoke-static {v1}, Lud3;->p0(Z)V

    .line 311
    .line 312
    .line 313
    invoke-static {p0}, Lio1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 314
    .line 315
    .line 316
    :cond_a
    :goto_3
    return-void

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
