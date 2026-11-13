.class public final synthetic Ldefpackage/q31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qc2;
.implements Ldefpackage/r83;
.implements Ldefpackage/lm2;
.implements Ldefpackage/wc0;
.implements Ldefpackage/f4;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Ldefpackage/q31;->n:I

    iput-object p3, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    iput p1, p0, Ldefpackage/q31;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILdefpackage/gy3;I)V
    .locals 0

    .line 12
    iput p3, p0, Ldefpackage/q31;->n:I

    iput p1, p0, Ldefpackage/q31;->o:I

    iput-object p2, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILdefpackage/va4;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p3, 0x4

    .line 2
    iput p3, p0, Ldefpackage/q31;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ldefpackage/q31;->o:I

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/fr2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 6
    .line 7
    check-cast p1, Ldefpackage/ic2;

    .line 8
    .line 9
    const-string v1, "MediaSessionStub"

    .line 10
    .line 11
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ldefpackage/m92;

    .line 16
    .line 17
    const-string v2, "LibraryResult must not be null"

    .line 18
    .line 19
    invoke-static {p1, v2}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_0

    .line 25
    :catch_1
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :catch_2
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :goto_0
    const-string v2, "Library operation failed"

    .line 30
    .line 31
    invoke-static {v1, v2, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    invoke-static {p1}, Ldefpackage/m92;->b(I)Ldefpackage/m92;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_2

    .line 40
    :goto_1
    const-string v2, "Library operation cancelled"

    .line 41
    .line 42
    invoke-static {v1, v2, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-static {p1}, Ldefpackage/m92;->b(I)Ldefpackage/m92;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_2
    :try_start_1
    iget-object v2, v0, Ldefpackage/fr2;->d:Ldefpackage/er2;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, p0, p1}, Ldefpackage/er2;->r(ILdefpackage/m92;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :catch_3
    move-exception p0

    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "Failed to send result to browser "

    .line 63
    .line 64
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {v1, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    return-void
.end method

.method public c(Ldefpackage/bm2;)V
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/q31;->n:I

    .line 2
    .line 3
    const/4 v1, -0x6

    .line 4
    sget-object v2, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 5
    .line 6
    const/4 v3, 0x6

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, Ldefpackage/va4;

    .line 17
    .line 18
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v7, v0, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-ne v1, v7, :cond_1

    .line 43
    .line 44
    move v4, v5

    .line 45
    :cond_1
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 49
    .line 50
    invoke-interface {v0, v6}, Ldefpackage/qk2;->y(Ldefpackage/va4;)Ldefpackage/mw1;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ldefpackage/gk;

    .line 55
    .line 56
    invoke-direct {v1, p1, v0, p0, v3}, Ldefpackage/gk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Ldefpackage/mw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :pswitch_0
    check-cast v6, Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 73
    .line 74
    iget-object v7, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 75
    .line 76
    invoke-static {v6}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    iput-object v8, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 81
    .line 82
    iget-object v8, p1, Ldefpackage/bm2;->t:Ldefpackage/yw1;

    .line 83
    .line 84
    iget-object v9, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 85
    .line 86
    iget-object v10, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 87
    .line 88
    iget-object v11, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-static {v8, v6, v9, v10, v11}, Ldefpackage/bm2;->u1(Ljava/util/List;Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)Ldefpackage/gy3;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    iput-object v8, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 95
    .line 96
    iget-object v9, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 97
    .line 98
    iget-object v10, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 99
    .line 100
    iget-object v11, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 101
    .line 102
    invoke-static {v8, v6, v9, v10, v11}, Ldefpackage/bm2;->t1(Ldefpackage/gy3;Ljava/util/List;Landroid/os/Bundle;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iput-object v6, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 107
    .line 108
    iget-object v6, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 109
    .line 110
    invoke-virtual {v6, v0}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v6, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 115
    .line 116
    invoke-virtual {v6, v7}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    iget-object v8, v6, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 131
    .line 132
    invoke-virtual {v8}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-ne v7, v8, :cond_3

    .line 137
    .line 138
    move v4, v5

    .line 139
    :cond_3
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v4, v6, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v5, Ldefpackage/ab4;

    .line 148
    .line 149
    invoke-direct {v5, v1}, Ldefpackage/ab4;-><init>(I)V

    .line 150
    .line 151
    .line 152
    new-instance v1, Ldefpackage/mw1;

    .line 153
    .line 154
    invoke-direct {v1, v5}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    if-nez v0, :cond_4

    .line 158
    .line 159
    invoke-interface {v4}, Ldefpackage/qk2;->u()V

    .line 160
    .line 161
    .line 162
    :cond_4
    new-instance v0, Ldefpackage/gk;

    .line 163
    .line 164
    invoke-direct {v0, p1, v1, p0, v3}, Ldefpackage/gk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0, v2}, Ldefpackage/mw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 168
    .line 169
    .line 170
    :goto_1
    return-void

    .line 171
    :pswitch_1
    check-cast v6, Ldefpackage/yw1;

    .line 172
    .line 173
    invoke-virtual {p1}, Ldefpackage/bm2;->Y()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_5

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    iget-object v0, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 181
    .line 182
    iget-object v7, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 183
    .line 184
    invoke-static {v6}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    iput-object v8, p1, Ldefpackage/bm2;->t:Ldefpackage/yw1;

    .line 189
    .line 190
    iget-object v8, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 191
    .line 192
    iget-object v9, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 193
    .line 194
    iget-object v10, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 195
    .line 196
    iget-object v11, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 197
    .line 198
    invoke-static {v6, v8, v9, v10, v11}, Ldefpackage/bm2;->u1(Ljava/util/List;Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)Ldefpackage/gy3;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    iput-object v6, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 203
    .line 204
    iget-object v8, p1, Ldefpackage/bm2;->s:Ldefpackage/yw1;

    .line 205
    .line 206
    iget-object v9, p1, Ldefpackage/bm2;->I:Landroid/os/Bundle;

    .line 207
    .line 208
    iget-object v10, p1, Ldefpackage/bm2;->w:Ldefpackage/wa4;

    .line 209
    .line 210
    iget-object v11, p1, Ldefpackage/bm2;->z:Ldefpackage/mi3;

    .line 211
    .line 212
    invoke-static {v6, v8, v9, v10, v11}, Ldefpackage/bm2;->t1(Ldefpackage/gy3;Ljava/util/List;Landroid/os/Bundle;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    iput-object v6, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 217
    .line 218
    iget-object v6, p1, Ldefpackage/bm2;->u:Ldefpackage/gy3;

    .line 219
    .line 220
    invoke-virtual {v6, v0}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget-object v6, p1, Ldefpackage/bm2;->v:Ldefpackage/gy3;

    .line 225
    .line 226
    invoke-virtual {v6, v7}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    iget-object v8, v6, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 241
    .line 242
    invoke-virtual {v8}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    if-ne v7, v8, :cond_6

    .line 247
    .line 248
    move v4, v5

    .line 249
    :cond_6
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v4, v6, Ldefpackage/sk2;->e:Ldefpackage/qk2;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v5, Ldefpackage/ab4;

    .line 258
    .line 259
    invoke-direct {v5, v1}, Ldefpackage/ab4;-><init>(I)V

    .line 260
    .line 261
    .line 262
    new-instance v1, Ldefpackage/mw1;

    .line 263
    .line 264
    invoke-direct {v1, v5}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    if-nez v0, :cond_7

    .line 268
    .line 269
    invoke-interface {v4}, Ldefpackage/qk2;->u()V

    .line 270
    .line 271
    .line 272
    :cond_7
    new-instance v0, Ldefpackage/gk;

    .line 273
    .line 274
    invoke-direct {v0, p1, v1, p0, v3}, Ldefpackage/gk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v0, v2}, Ldefpackage/mw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 278
    .line 279
    .line 280
    :goto_2
    return-void

    .line 281
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->w(I)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/q31;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldefpackage/pe4;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/oi3;

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 13
    .line 14
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 15
    .line 16
    invoke-interface {p1, v0, p0}, Ldefpackage/oi3;->I(Ldefpackage/cu4;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldefpackage/ph3;

    .line 23
    .line 24
    check-cast p1, Ldefpackage/oi3;

    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/ph3;->a:Ldefpackage/cu4;

    .line 27
    .line 28
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 29
    .line 30
    invoke-interface {p1, v0, p0}, Ldefpackage/oi3;->I(Ldefpackage/cu4;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public x(Landroid/view/View;Ldefpackage/pb5;)Ldefpackage/pb5;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/q31;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    iget-object v2, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v1, v1, Ldefpackage/vz1;->d:I

    .line 13
    .line 14
    iget p0, p0, Ldefpackage/q31;->o:I

    .line 15
    .line 16
    add-int/2addr p0, v1

    .line 17
    iput p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
