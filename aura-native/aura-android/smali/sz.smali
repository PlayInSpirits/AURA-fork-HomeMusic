.class public final Lsz;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Lta5;Lqr2;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lsz;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsz;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lsz;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lsz;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lsz;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Lsz;->n:I

    iput-object p1, p0, Lsz;->r:Ljava/lang/Object;

    iput-object p2, p0, Lsz;->o:Ljava/lang/Object;

    iput-object p3, p0, Lsz;->p:Ljava/lang/Object;

    iput-object p4, p0, Lsz;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lsz;->n:I

    .line 2
    .line 3
    const-string v1, "MBServiceCompat"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Lsz;->r:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Lsz;->q:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, p0, Lsz;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lsz;->o:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Landroid/view/View;

    .line 20
    .line 21
    check-cast v7, Lta5;

    .line 22
    .line 23
    check-cast v6, Lqr2;

    .line 24
    .line 25
    invoke-static {p0, v7, v6}, Lpa5;->i(Landroid/view/View;Lta5;Lqr2;)V

    .line 26
    .line 27
    .line 28
    check-cast v5, Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->start()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    check-cast v7, Ljava/lang/String;

    .line 35
    .line 36
    check-cast p0, Lhg3;

    .line 37
    .line 38
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/os/Messenger;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast v5, Lpz1;

    .line 47
    .line 48
    iget-object v0, v5, Lpz1;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lpn2;

    .line 51
    .line 52
    iget-object v0, v0, Lpn2;->r:Loi;

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Loj2;

    .line 59
    .line 60
    if-nez p0, :cond_0

    .line 61
    .line 62
    const-string p0, "getMediaItem for callback that isn\'t registered id="

    .line 63
    .line 64
    invoke-static {p0, v7, v1}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, v5, Lpz1;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lpn2;

    .line 71
    .line 72
    check-cast v6, Lv14;

    .line 73
    .line 74
    new-instance v1, Lnj2;

    .line 75
    .line 76
    invoke-direct {v1, v7, v6, v4}, Lnj2;-><init>(Ljava/lang/Object;Lv14;I)V

    .line 77
    .line 78
    .line 79
    iput-object p0, v0, Lpn2;->s:Loj2;

    .line 80
    .line 81
    invoke-virtual {v0, v7, v1}, Lpn2;->e(Ljava/lang/String;Luj2;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, v0, Lpn2;->s:Loj2;

    .line 85
    .line 86
    invoke-virtual {v1}, Luj2;->b()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string p0, "onLoadItem must call detach() or sendResult() before returning for id="

    .line 94
    .line 95
    invoke-static {p0, v7}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    return-void

    .line 103
    :pswitch_1
    check-cast v7, Ljava/lang/String;

    .line 104
    .line 105
    check-cast p0, Lhg3;

    .line 106
    .line 107
    iget-object p0, p0, Lhg3;->o:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, Landroid/os/Messenger;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast v5, Lpz1;

    .line 116
    .line 117
    iget-object v0, v5, Lpz1;->o:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lpn2;

    .line 120
    .line 121
    iget-object v0, v0, Lpn2;->r:Loi;

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Loj2;

    .line 128
    .line 129
    if-nez p0, :cond_2

    .line 130
    .line 131
    const-string p0, "removeSubscription for callback that isn\'t registered id="

    .line 132
    .line 133
    invoke-static {p0, v7, v1}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_2
    iget-object v0, p0, Loj2;->f:Ljava/util/HashMap;

    .line 138
    .line 139
    iget-object v5, v5, Lpz1;->o:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v5, Lpn2;

    .line 142
    .line 143
    check-cast v6, Landroid/os/IBinder;

    .line 144
    .line 145
    if-nez v6, :cond_4

    .line 146
    .line 147
    :try_start_0
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    move v2, v4

    .line 155
    :goto_1
    iput-object p0, v5, Lpn2;->s:Loj2;

    .line 156
    .line 157
    invoke-virtual {v5, v7}, Lpn2;->f(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iput-object v3, v5, Lpn2;->s:Loj2;

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    goto :goto_5

    .line 165
    :cond_4
    :try_start_1
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    check-cast v8, Ljava/util/List;

    .line 170
    .line 171
    if-eqz v8, :cond_7

    .line 172
    .line 173
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    :cond_5
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_6

    .line 182
    .line 183
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, Lld3;

    .line 188
    .line 189
    iget-object v10, v10, Lld3;->a:Ljava/lang/Object;

    .line 190
    .line 191
    if-ne v6, v10, :cond_5

    .line 192
    .line 193
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 194
    .line 195
    .line 196
    move v4, v2

    .line 197
    goto :goto_2

    .line 198
    :cond_6
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    .line 207
    :cond_7
    iput-object p0, v5, Lpn2;->s:Loj2;

    .line 208
    .line 209
    invoke-virtual {v5, v7}, Lpn2;->f(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iput-object v3, v5, Lpn2;->s:Loj2;

    .line 213
    .line 214
    move v2, v4

    .line 215
    :goto_3
    if-nez v2, :cond_8

    .line 216
    .line 217
    new-instance p0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v0, "removeSubscription called for "

    .line 220
    .line 221
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v0, " which is not subscribed"

    .line 228
    .line 229
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-static {v1, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    :goto_4
    return-void

    .line 240
    :goto_5
    iput-object p0, v5, Lpn2;->s:Loj2;

    .line 241
    .line 242
    invoke-virtual {v5, v7}, Lpn2;->f(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iput-object v3, v5, Lpn2;->s:Loj2;

    .line 246
    .line 247
    throw v0

    .line 248
    :pswitch_2
    check-cast v5, Lbq4;

    .line 249
    .line 250
    :goto_6
    iget-object v0, v5, Lbq4;->q:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Lpn2;

    .line 253
    .line 254
    iget-object v0, v0, Lpn2;->r:Loi;

    .line 255
    .line 256
    iget v1, v0, Lyd4;->p:I

    .line 257
    .line 258
    if-ge v4, v1, :cond_a

    .line 259
    .line 260
    invoke-virtual {v0, v4}, Lyd4;->j(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Loj2;

    .line 265
    .line 266
    iget-object v1, v0, Loj2;->d:Lms2;

    .line 267
    .line 268
    move-object v2, p0

    .line 269
    check-cast v2, Lms2;

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Lms2;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_9

    .line 276
    .line 277
    move-object v1, v7

    .line 278
    check-cast v1, Ljava/lang/String;

    .line 279
    .line 280
    move-object v2, v6

    .line 281
    check-cast v2, Landroid/os/Bundle;

    .line 282
    .line 283
    invoke-virtual {v5, v0, v1, v2}, Lbq4;->o(Loj2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 284
    .line 285
    .line 286
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_a
    return-void

    .line 290
    :pswitch_3
    check-cast v5, Ld34;

    .line 291
    .line 292
    iget-object v0, v5, Ld34;->o:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Luz;

    .line 295
    .line 296
    check-cast v7, Ltu2;

    .line 297
    .line 298
    check-cast p0, Ltz;

    .line 299
    .line 300
    if-eqz p0, :cond_b

    .line 301
    .line 302
    iput-boolean v2, v0, Luz;->M:Z

    .line 303
    .line 304
    iget-object p0, p0, Ltz;->b:Lqu2;

    .line 305
    .line 306
    invoke-virtual {p0, v4}, Lqu2;->c(Z)V

    .line 307
    .line 308
    .line 309
    iput-boolean v4, v0, Luz;->M:Z

    .line 310
    .line 311
    :cond_b
    invoke-virtual {v7}, Ltu2;->isEnabled()Z

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    if-eqz p0, :cond_c

    .line 316
    .line 317
    invoke-virtual {v7}, Ltu2;->hasSubMenu()Z

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    if-eqz p0, :cond_c

    .line 322
    .line 323
    check-cast v6, Lqu2;

    .line 324
    .line 325
    const/4 p0, 0x4

    .line 326
    invoke-virtual {v6, v7, v3, p0}, Lqu2;->q(Landroid/view/MenuItem;Lgv2;I)Z

    .line 327
    .line 328
    .line 329
    :cond_c
    return-void

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
