.class public final synthetic Lwf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lxf4;


# direct methods
.method public synthetic constructor <init>(Lxf4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwf4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwf4;->o:Lxf4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    .line 1
    iget v0, p0, Lwf4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lwf4;->o:Lxf4;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxf4;->B0:Lpz1;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lu52;->c()Lv52;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-boolean p1, p1, Lv52;->a:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string p0, "cancel"

    .line 23
    .line 24
    invoke-static {v1, p0}, Lu52;->s(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v2}, Lyf4;->a(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void

    .line 43
    :pswitch_0
    sget-object v0, Lxf4;->C0:[I

    .line 44
    .line 45
    aget p2, v0, p2

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    const/4 v3, 0x0

    .line 49
    if-ne p2, v0, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 52
    .line 53
    .line 54
    new-instance p1, Landroid/widget/EditText;

    .line 55
    .line 56
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-direct {p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const/4 p2, 0x2

    .line 64
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setInputType(I)V

    .line 65
    .line 66
    .line 67
    const p2, 0x7f13052e

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, Lkc1;->s(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 86
    .line 87
    const/high16 v0, 0x41800000    # 16.0f

    .line 88
    .line 89
    mul-float/2addr p2, v0

    .line 90
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 95
    .line 96
    .line 97
    new-instance p2, Lvg2;

    .line 98
    .line 99
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {p2, v0, v1}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 104
    .line 105
    .line 106
    const v0, 0x7f130534

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, Lvg2;->p(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    new-instance v0, Lb62;

    .line 117
    .line 118
    invoke-direct {v0, p0, p1, v2}, Lb62;-><init>(Lkc1;Ljava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    const p0, 0x7f13052f

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p0, v0}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const p1, 0x7f130532

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1, v3}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Le9;->h()Lf9;

    .line 136
    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_2
    iget-object p0, p0, Lxf4;->B0:Lpz1;

    .line 141
    .line 142
    const/4 v0, -0x2

    .line 143
    if-ne p2, v0, :cond_5

    .line 144
    .line 145
    if-eqz p0, :cond_4

    .line 146
    .line 147
    invoke-static {}, Lu52;->c()Lv52;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    iget-boolean p2, p2, Lv52;->a:Z

    .line 152
    .line 153
    if-eqz p2, :cond_3

    .line 154
    .line 155
    const-string p0, "end"

    .line 156
    .line 157
    invoke-static {v1, p0}, Lu52;->s(ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, Lyf4;->e()V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 171
    .line 172
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    new-instance v0, Lvj3;

    .line 177
    .line 178
    invoke-direct {v0, p0}, Lvj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V

    .line 179
    .line 180
    .line 181
    iput-object v0, p2, Lyf4;->h:Lvj3;

    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 184
    .line 185
    .line 186
    :cond_4
    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_5
    if-eqz p0, :cond_8

    .line 191
    .line 192
    invoke-static {}, Lu52;->c()Lv52;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-boolean v0, v0, Lv52;->a:Z

    .line 197
    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    const-string p0, "minutes"

    .line 201
    .line 202
    invoke-static {p2, p0}, Lu52;->s(ILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_6
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, v1}, Lyf4;->a(Z)V

    .line 211
    .line 212
    .line 213
    iput-boolean v1, v0, Lyf4;->g:Z

    .line 214
    .line 215
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 216
    .line 217
    .line 218
    move-result-wide v4

    .line 219
    int-to-long v6, p2

    .line 220
    const-wide/32 v8, 0xea60

    .line 221
    .line 222
    .line 223
    mul-long/2addr v6, v8

    .line 224
    add-long/2addr v6, v4

    .line 225
    iput-wide v6, v0, Lyf4;->e:J

    .line 226
    .line 227
    iput-boolean v2, v0, Lyf4;->f:Z

    .line 228
    .line 229
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 237
    .line 238
    .line 239
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 240
    :catch_0
    if-nez v3, :cond_7

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_7
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    const-string v1, "sleep_timer_end_time_ms"

    .line 248
    .line 249
    iget-wide v2, v0, Lyf4;->e:J

    .line 250
    .line 251
    invoke-interface {p2, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    const-string v1, "sleep_timer_end_of_track"

    .line 256
    .line 257
    iget-boolean v2, v0, Lyf4;->g:Z

    .line 258
    .line 259
    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 264
    .line 265
    .line 266
    :goto_2
    new-instance p2, Ljq3;

    .line 267
    .line 268
    const/16 v1, 0x8

    .line 269
    .line 270
    invoke-direct {p2, v1, v0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iput-object p2, v0, Lyf4;->b:Ljq3;

    .line 274
    .line 275
    iget-object v0, v0, Lyf4;->a:Landroid/os/Handler;

    .line 276
    .line 277
    const-wide/16 v1, 0x3e8

    .line 278
    .line 279
    invoke-virtual {v0, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 280
    .line 281
    .line 282
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 285
    .line 286
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    new-instance v0, Lvj3;

    .line 291
    .line 292
    invoke-direct {v0, p0}, Lvj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V

    .line 293
    .line 294
    .line 295
    iput-object v0, p2, Lyf4;->h:Lvj3;

    .line 296
    .line 297
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 298
    .line 299
    .line 300
    :cond_8
    :goto_3
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 301
    .line 302
    .line 303
    :goto_4
    return-void

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
