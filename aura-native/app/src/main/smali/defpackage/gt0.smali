.class public final synthetic Ldefpackage/gt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/gt0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/gt0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/gt0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object p0, p0, Ldefpackage/gt0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ldefpackage/w12;

    .line 13
    .line 14
    iget p1, p1, Landroid/os/Message;->what:I

    .line 15
    .line 16
    if-eq p1, v4, :cond_3

    .line 17
    .line 18
    if-eq p1, v2, :cond_2

    .line 19
    .line 20
    if-eq p1, v1, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object p0, p0, Ldefpackage/w12;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ldefpackage/cn4;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/cn4;->a()V

    .line 31
    .line 32
    .line 33
    :goto_0
    move v3, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p0, p0, Ldefpackage/w12;->j:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/bn4;

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/bn4;->a()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object p0, p0, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ldefpackage/an4;

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/an4;->a()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object p0, p0, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/zm4;

    .line 54
    .line 55
    invoke-virtual {p0}, Ldefpackage/zm4;->a()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    return v3

    .line 60
    :pswitch_0
    check-cast p0, Ldefpackage/gm2;

    .line 61
    .line 62
    iget p1, p1, Landroid/os/Message;->what:I

    .line 63
    .line 64
    if-ne p1, v4, :cond_4

    .line 65
    .line 66
    iget-object p0, p0, Ldefpackage/gm2;->e:Ldefpackage/im2;

    .line 67
    .line 68
    iget-object p1, p0, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 69
    .line 70
    invoke-virtual {p0, v3, p1}, Ldefpackage/im2;->b1(ZLdefpackage/hm2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return v4

    .line 74
    :pswitch_1
    check-cast p0, Ldefpackage/rf2;

    .line 75
    .line 76
    iget p1, p1, Landroid/os/Message;->what:I

    .line 77
    .line 78
    if-ne p1, v4, :cond_5

    .line 79
    .line 80
    :try_start_0
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Ldefpackage/bm2;

    .line 83
    .line 84
    iget-object p1, p0, Ldefpackage/bm2;->D:Ldefpackage/pu1;

    .line 85
    .line 86
    iget-object p0, p0, Ldefpackage/bm2;->c:Ldefpackage/mm2;

    .line 87
    .line 88
    invoke-interface {p1, p0}, Ldefpackage/pu1;->p0(Ldefpackage/ju1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catch_0
    const-string p0, "MCImplBase"

    .line 93
    .line 94
    const-string p1, "Error in sending flushCommandQueue"

    .line 95
    .line 96
    invoke-static {p0, p1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_2
    return v4

    .line 100
    :pswitch_2
    check-cast p0, Ldefpackage/tc2;

    .line 101
    .line 102
    iget-object p1, p0, Ldefpackage/tc2;->c:Ldefpackage/rc2;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Ldefpackage/tc2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_8

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Ldefpackage/sc2;

    .line 124
    .line 125
    iget-boolean v5, v1, Ldefpackage/sc2;->d:Z

    .line 126
    .line 127
    if-nez v5, :cond_7

    .line 128
    .line 129
    iget-boolean v5, v1, Ldefpackage/sc2;->c:Z

    .line 130
    .line 131
    if-eqz v5, :cond_7

    .line 132
    .line 133
    iget-object v5, v1, Ldefpackage/sc2;->b:Ldefpackage/xk0;

    .line 134
    .line 135
    invoke-virtual {v5}, Ldefpackage/xk0;->f()Ldefpackage/w71;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v6, Ldefpackage/xk0;

    .line 140
    .line 141
    invoke-direct {v6, v2}, Ldefpackage/xk0;-><init>(I)V

    .line 142
    .line 143
    .line 144
    iput-object v6, v1, Ldefpackage/sc2;->b:Ldefpackage/xk0;

    .line 145
    .line 146
    iput-boolean v3, v1, Ldefpackage/sc2;->c:Z

    .line 147
    .line 148
    iget-object v1, v1, Ldefpackage/sc2;->a:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-interface {p1, v1, v5}, Ldefpackage/rc2;->f(Ljava/lang/Object;Ldefpackage/w71;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-object v1, p0, Ldefpackage/tc2;->b:Ldefpackage/yp4;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v1, v1, Ldefpackage/yp4;->a:Landroid/os/Handler;

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Landroid/os/Handler;->hasMessages(I)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_6

    .line 165
    .line 166
    :cond_8
    return v4

    .line 167
    :pswitch_3
    check-cast p0, Ldefpackage/lt0;

    .line 168
    .line 169
    iget-object v0, p0, Ldefpackage/lt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 170
    .line 171
    iget v5, p1, Landroid/os/Message;->what:I

    .line 172
    .line 173
    if-eq v5, v4, :cond_e

    .line 174
    .line 175
    if-eq v5, v2, :cond_d

    .line 176
    .line 177
    if-ne v5, v1, :cond_c

    .line 178
    .line 179
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, Ldefpackage/ht0;

    .line 182
    .line 183
    iget-object v1, p1, Ldefpackage/ht0;->c:Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iput-object v1, p0, Ldefpackage/lt0;->l:Ljava/util/List;

    .line 190
    .line 191
    iget-object v1, p1, Ldefpackage/ht0;->a:Ldefpackage/ns0;

    .line 192
    .line 193
    invoke-virtual {p0}, Ldefpackage/lt0;->e()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget-boolean p1, p1, Ldefpackage/ht0;->b:Z

    .line 198
    .line 199
    if-eqz p1, :cond_9

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_a

    .line 210
    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Ldefpackage/jt0;

    .line 216
    .line 217
    invoke-interface {v0, v1}, Ldefpackage/jt0;->d(Ldefpackage/ns0;)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_a

    .line 230
    .line 231
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Ldefpackage/jt0;

    .line 236
    .line 237
    invoke-interface {v0, p0, v1}, Ldefpackage/jt0;->b(Ldefpackage/lt0;Ldefpackage/ns0;)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_a
    if-eqz v2, :cond_b

    .line 242
    .line 243
    invoke-virtual {p0}, Ldefpackage/lt0;->a()V

    .line 244
    .line 245
    .line 246
    :cond_b
    :goto_5
    move v3, v4

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_d
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 253
    .line 254
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 255
    .line 256
    iget v2, p0, Ldefpackage/lt0;->f:I

    .line 257
    .line 258
    sub-int/2addr v2, v1

    .line 259
    iput v2, p0, Ldefpackage/lt0;->f:I

    .line 260
    .line 261
    iput p1, p0, Ldefpackage/lt0;->g:I

    .line 262
    .line 263
    if-nez p1, :cond_b

    .line 264
    .line 265
    if-nez v2, :cond_b

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eqz p1, :cond_b

    .line 276
    .line 277
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    check-cast p1, Ldefpackage/jt0;

    .line 282
    .line 283
    invoke-interface {p1}, Ldefpackage/jt0;->e()V

    .line 284
    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_e
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p1, Ljava/util/List;

    .line 290
    .line 291
    iput-boolean v4, p0, Ldefpackage/lt0;->h:Z

    .line 292
    .line 293
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iput-object p1, p0, Ldefpackage/lt0;->l:Ljava/util/List;

    .line 298
    .line 299
    invoke-virtual {p0}, Ldefpackage/lt0;->e()Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_f

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Ldefpackage/jt0;

    .line 318
    .line 319
    invoke-interface {v1, p0}, Ldefpackage/jt0;->a(Ldefpackage/lt0;)V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_f
    if-eqz p1, :cond_b

    .line 324
    .line 325
    invoke-virtual {p0}, Ldefpackage/lt0;->a()V

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :goto_8
    return v3

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
