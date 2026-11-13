.class public final synthetic Ldefpackage/v6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p4, p0, Ldefpackage/v6;->n:I

    iput-object p1, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/lo2;Ldefpackage/sk2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 15
    const/16 p1, 0x1d

    iput p1, p0, Ldefpackage/v6;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/pn2;Ldefpackage/fr2;Ldefpackage/uj2;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p4, 0x1a

    .line 2
    .line 3
    iput p4, p0, Ldefpackage/v6;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/ic2;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/lb4;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldefpackage/gn2;

    .line 12
    .line 13
    :try_start_0
    invoke-static {v0}, Ldefpackage/hw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :catch_1
    move-exception v0

    .line 23
    :goto_0
    const-string v2, "MLSLegacyStub"

    .line 24
    .line 25
    const-string v3, "failed to get bitmap"

    .line 26
    .line 27
    invoke-static {v2, v3, v0}, Ldefpackage/l93;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_1
    invoke-static {p0, v0}, Ldefpackage/f92;->a(Ldefpackage/gn2;Landroid/graphics/Bitmap;)Ldefpackage/ij2;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v1, p0}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/pn2;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/fr2;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldefpackage/uj2;

    .line 12
    .line 13
    iget-object v2, v0, Ldefpackage/pn2;->x:Ldefpackage/na4;

    .line 14
    .line 15
    const v3, 0xc354

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1, v3}, Ldefpackage/na4;->I(Ldefpackage/fr2;I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, Ldefpackage/uj2;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v2, v0, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 30
    .line 31
    iget-object v3, v2, Ldefpackage/tn2;->D:Ldefpackage/pq;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ldefpackage/tn2;->B(Ldefpackage/fr2;)Ldefpackage/fr2;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/4 v3, -0x6

    .line 40
    invoke-static {v3}, Ldefpackage/m92;->b(I)Ldefpackage/m92;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, Ldefpackage/mw1;

    .line 45
    .line 46
    invoke-direct {v4, v3}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Ldefpackage/sn2;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v3, v2, v4, v1, v5}, Ldefpackage/sn2;-><init>(Ldefpackage/tn2;Ldefpackage/mw1;Ldefpackage/fr2;I)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Ldefpackage/rn2;

    .line 56
    .line 57
    invoke-direct {v1, v2, v5}, Ldefpackage/rn2;-><init>(Ldefpackage/tn2;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v3, v1}, Ldefpackage/mw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Ldefpackage/ln2;

    .line 64
    .line 65
    invoke-direct {v1, v0, v5}, Ldefpackage/ln2;-><init>(Ldefpackage/pn2;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v4, v1}, Ldefpackage/f35;->h0(Ldefpackage/ic2;Ldefpackage/mk;)Ldefpackage/lb4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Ldefpackage/nn2;

    .line 73
    .line 74
    invoke-direct {v1, v0, p0, v5}, Ldefpackage/nn2;-><init>(Ldefpackage/lb4;Ldefpackage/uj2;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 78
    .line 79
    invoke-virtual {v0, v1, p0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tn2;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/fr2;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Ldefpackage/fr2;->d:Ldefpackage/er2;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, Ldefpackage/tn2;->E:Ldefpackage/nl1;

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1}, Ldefpackage/u1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/tn2;->F:Ldefpackage/nl1;

    .line 27
    .line 28
    invoke-virtual {v0, v2, p0}, Ldefpackage/u1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/v6;->n:I

    .line 4
    .line 5
    const v2, 0x7f1301d1

    .line 6
    .line 7
    .line 8
    const v3, 0x7f1301b0

    .line 9
    .line 10
    .line 11
    const/16 v4, 0x194

    .line 12
    .line 13
    const/16 v5, 0xc

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ldefpackage/sk2;

    .line 24
    .line 25
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-virtual {v1}, Ldefpackage/sk2;->c1()V

    .line 34
    .line 35
    .line 36
    iget-object v3, v1, Ldefpackage/sk2;->d:Ldefpackage/rk2;

    .line 37
    .line 38
    invoke-interface {v3}, Ldefpackage/rk2;->Y()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    sget-object v3, Ldefpackage/wa4;->b:Ldefpackage/wa4;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-interface {v3}, Ldefpackage/rk2;->P0()Ldefpackage/wa4;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_0
    iget-object v3, v3, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 52
    .line 53
    invoke-virtual {v3}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ldefpackage/va4;

    .line 68
    .line 69
    iget v5, v4, Ldefpackage/va4;->a:I

    .line 70
    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    iget-object v5, v4, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_1

    .line 80
    .line 81
    move-object v6, v4

    .line 82
    :cond_2
    if-nez v6, :cond_3

    .line 83
    .line 84
    invoke-static {v2}, Ldefpackage/j60;->n(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    :cond_3
    new-instance v3, Ldefpackage/va4;

    .line 91
    .line 92
    invoke-direct {v3, v2, v0}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 96
    .line 97
    invoke-virtual {v1, v3, v0}, Ldefpackage/sk2;->b1(Ldefpackage/va4;Landroid/os/Bundle;)Ldefpackage/ic2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v1, Ldefpackage/vc0;

    .line 102
    .line 103
    invoke-direct {v1, v2}, Ldefpackage/vc0;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 107
    .line 108
    new-instance v3, Ldefpackage/lg1;

    .line 109
    .line 110
    invoke-direct {v3, v8, v0, v1}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v3, v2}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void

    .line 117
    :pswitch_0
    invoke-direct {v0}, Ldefpackage/v6;->c()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_1
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ldefpackage/pn2;

    .line 124
    .line 125
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Ldefpackage/fr2;

    .line 128
    .line 129
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v3, v1, Ldefpackage/pn2;->x:Ldefpackage/na4;

    .line 134
    .line 135
    const v4, 0xc352

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v2, v4}, Ldefpackage/na4;->I(Ldefpackage/fr2;I)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    iget-object v1, v1, Ldefpackage/pn2;->z:Ldefpackage/tn2;

    .line 146
    .line 147
    invoke-virtual {v1, v2, v0}, Ldefpackage/tn2;->z(Ldefpackage/fr2;Ljava/lang/String;)Ldefpackage/mw1;

    .line 148
    .line 149
    .line 150
    :goto_1
    return-void

    .line 151
    :pswitch_2
    invoke-direct {v0}, Ldefpackage/v6;->b()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_3
    invoke-direct {v0}, Ldefpackage/v6;->a()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_4
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 162
    .line 163
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Ldefpackage/oy;

    .line 166
    .line 167
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ldefpackage/uy1;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_6

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    :try_start_0
    invoke-virtual {v0}, Ldefpackage/uy1;->invoke()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v6}, Ldefpackage/oy;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    invoke-virtual {v2, v0}, Ldefpackage/oy;->b(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    :goto_2
    return-void

    .line 190
    :pswitch_5
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Ldefpackage/fx3;

    .line 193
    .line 194
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v2, Ldefpackage/fx3;

    .line 197
    .line 198
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Ldefpackage/f9;

    .line 201
    .line 202
    iput-boolean v8, v1, Ldefpackage/fx3;->n:Z

    .line 203
    .line 204
    iget-boolean v1, v2, Ldefpackage/fx3;->n:Z

    .line 205
    .line 206
    if-nez v1, :cond_7

    .line 207
    .line 208
    const v1, 0x7f1302b1

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ldefpackage/dg;->setTitle(I)V

    .line 212
    .line 213
    .line 214
    :cond_7
    return-void

    .line 215
    :pswitch_6
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 218
    .line 219
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Ljava/lang/Runnable;

    .line 224
    .line 225
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-nez v3, :cond_e

    .line 230
    .line 231
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_8

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_8
    instance-of v3, v2, Ldefpackage/s14;

    .line 239
    .line 240
    if-nez v3, :cond_9

    .line 241
    .line 242
    move-object v3, v2

    .line 243
    check-cast v3, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 244
    .line 245
    invoke-static {v1, v3}, Lcom/eddyizm/tempus/homemusic/b;->i(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/homemusic/WaveOut;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    invoke-static {v2}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    if-eqz v2, :cond_e

    .line 253
    .line 254
    const-string v3, "HubWave"

    .line 255
    .line 256
    const-string v4, "start"

    .line 257
    .line 258
    invoke-static {v3, v4, v2}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 259
    .line 260
    .line 261
    if-eqz v0, :cond_a

    .line 262
    .line 263
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_a
    instance-of v0, v2, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 268
    .line 269
    if-eqz v0, :cond_b

    .line 270
    .line 271
    move-object v6, v2

    .line 272
    check-cast v6, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 273
    .line 274
    :cond_b
    if-eqz v6, :cond_c

    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-nez v0, :cond_d

    .line 281
    .line 282
    :cond_c
    const v0, 0x7f130260

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    :cond_d
    invoke-static {v1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 297
    .line 298
    .line 299
    :cond_e
    :goto_3
    return-void

    .line 300
    :pswitch_7
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 303
    .line 304
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Ldefpackage/jx3;

    .line 307
    .line 308
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Ljava/io/Serializable;

    .line 311
    .line 312
    sget-object v3, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 313
    .line 314
    iget-object v2, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v2, Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 317
    .line 318
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setInFlight(Z)V

    .line 319
    .line 320
    .line 321
    sget-object v3, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 322
    .line 323
    if-eq v3, v1, :cond_f

    .line 324
    .line 325
    goto/16 :goto_5

    .line 326
    .line 327
    :cond_f
    instance-of v3, v0, Ldefpackage/s14;

    .line 328
    .line 329
    const/4 v6, 0x2

    .line 330
    if-nez v3, :cond_12

    .line 331
    .line 332
    move-object v3, v0

    .line 333
    check-cast v3, Ldefpackage/kd3;

    .line 334
    .line 335
    iget-object v9, v3, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v9, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 338
    .line 339
    iget-object v3, v3, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v3, Ljava/util/List;

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->sent(Lcom/eddyizm/tempus/homemusic/WaveNextIn;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setFailures(I)V

    .line 347
    .line 348
    .line 349
    invoke-static {v1, v3}, Lcom/eddyizm/tempus/homemusic/b;->b(Lcom/eddyizm/tempus/homemusic/WaveSession;Ljava/util/List;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getAskedFor()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setSettledFor(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getAgain()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_10

    .line 364
    .line 365
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_5

    .line 369
    .line 370
    :cond_10
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->f(Lcom/eddyizm/tempus/homemusic/WaveSession;)V

    .line 371
    .line 372
    .line 373
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    if-eqz v2, :cond_16

    .line 378
    .line 379
    invoke-static {v2, v1}, Lcom/eddyizm/tempus/homemusic/b;->a(Ldefpackage/qi3;Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/ArrayList;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    if-eqz v3, :cond_11

    .line 392
    .line 393
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getPending()Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-eqz v3, :cond_11

    .line 398
    .line 399
    if-gt v2, v6, :cond_11

    .line 400
    .line 401
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getPolls()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    add-int/2addr v2, v7

    .line 406
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setPolls(I)V

    .line 407
    .line 408
    .line 409
    sget-object v2, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 410
    .line 411
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getPolls()I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterPending(I)Ljava/lang/Long;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    if-eqz v2, :cond_12

    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 422
    .line 423
    .line 424
    move-result-wide v2

    .line 425
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->e()V

    .line 426
    .line 427
    .line 428
    new-instance v8, Ldefpackage/u6;

    .line 429
    .line 430
    invoke-direct {v8, v5}, Ldefpackage/u6;-><init>(I)V

    .line 431
    .line 432
    .line 433
    sput-object v8, Lcom/eddyizm/tempus/homemusic/b;->c:Ldefpackage/u6;

    .line 434
    .line 435
    sget-object v9, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 436
    .line 437
    invoke-virtual {v9, v8, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 438
    .line 439
    .line 440
    goto :goto_4

    .line 441
    :cond_11
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setPolls(I)V

    .line 442
    .line 443
    .line 444
    :cond_12
    :goto_4
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-eqz v0, :cond_16

    .line 449
    .line 450
    instance-of v2, v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 451
    .line 452
    if-eqz v2, :cond_13

    .line 453
    .line 454
    move-object v3, v0

    .line 455
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 456
    .line 457
    iget v3, v3, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 458
    .line 459
    if-ne v3, v4, :cond_13

    .line 460
    .line 461
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getId()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v1, v7}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setInFlight(Z)V

    .line 466
    .line 467
    .line 468
    sget-object v2, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 469
    .line 470
    new-instance v3, Ldefpackage/ws1;

    .line 471
    .line 472
    const/4 v4, 0x5

    .line 473
    invoke-direct {v3, v1, v0, v4}, Ldefpackage/ws1;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 474
    .line 475
    .line 476
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 477
    .line 478
    .line 479
    goto :goto_5

    .line 480
    :cond_13
    const-string v3, "HubWave"

    .line 481
    .line 482
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getId()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    new-instance v8, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    const-string v9, "next "

    .line 493
    .line 494
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    const-string v4, ": "

    .line 501
    .line 502
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 513
    .line 514
    .line 515
    if-nez v2, :cond_14

    .line 516
    .line 517
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 518
    .line 519
    .line 520
    :cond_14
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getFailures()I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    add-int/2addr v0, v7

    .line 525
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setFailures(I)V

    .line 526
    .line 527
    .line 528
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->f(Lcom/eddyizm/tempus/homemusic/WaveSession;)V

    .line 529
    .line 530
    .line 531
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->j(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ldefpackage/qi3;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    if-eqz v0, :cond_16

    .line 536
    .line 537
    invoke-static {v0, v1}, Lcom/eddyizm/tempus/homemusic/b;->a(Ldefpackage/qi3;Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/ArrayList;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getAgain()Z

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    if-nez v2, :cond_15

    .line 550
    .line 551
    if-gt v0, v6, :cond_16

    .line 552
    .line 553
    :cond_15
    sget-object v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 554
    .line 555
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getFailures()I

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterFailure(I)Ljava/lang/Long;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-eqz v0, :cond_16

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 566
    .line 567
    .line 568
    move-result-wide v0

    .line 569
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->e()V

    .line 570
    .line 571
    .line 572
    new-instance v2, Ldefpackage/u6;

    .line 573
    .line 574
    invoke-direct {v2, v5}, Ldefpackage/u6;-><init>(I)V

    .line 575
    .line 576
    .line 577
    sput-object v2, Lcom/eddyizm/tempus/homemusic/b;->c:Ldefpackage/u6;

    .line 578
    .line 579
    sget-object v3, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 580
    .line 581
    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 582
    .line 583
    .line 584
    :cond_16
    :goto_5
    return-void

    .line 585
    :pswitch_8
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 588
    .line 589
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v2, Ljava/lang/String;

    .line 592
    .line 593
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 594
    .line 595
    move-object v3, v0

    .line 596
    check-cast v3, Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 597
    .line 598
    new-instance v4, Ldefpackage/jx3;

    .line 599
    .line 600
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 601
    .line 602
    .line 603
    iput-object v1, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 604
    .line 605
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 606
    .line 607
    :try_start_1
    sget-object v0, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 608
    .line 609
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    sget-object v5, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 614
    .line 615
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    const-string v6, "typed_favorites_v1"

    .line 620
    .line 621
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v5

    .line 625
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 626
    .line 627
    .line 628
    move-result-object v6

    .line 629
    const-string v8, "favorite_compensation_chains_v1"

    .line 630
    .line 631
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v6

    .line 635
    invoke-virtual {v1, v5, v6, v0}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->compatible(ZZLjava/lang/String;)Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    iput-object v1, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 640
    .line 641
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->getPlayed()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    if-eqz v1, :cond_17

    .line 646
    .line 647
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 648
    .line 649
    .line 650
    move-result v5

    .line 651
    if-eqz v5, :cond_17

    .line 652
    .line 653
    goto :goto_6

    .line 654
    :catchall_1
    move-exception v0

    .line 655
    goto :goto_8

    .line 656
    :cond_17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 661
    .line 662
    .line 663
    move-result v5

    .line 664
    if-eqz v5, :cond_1a

    .line 665
    .line 666
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v5

    .line 670
    check-cast v5, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 671
    .line 672
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    if-eqz v5, :cond_18

    .line 677
    .line 678
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 679
    .line 680
    if-eqz v0, :cond_19

    .line 681
    .line 682
    new-instance v1, Ldefpackage/bt1;

    .line 683
    .line 684
    invoke-direct {v1, v2, v4, v7}, Ldefpackage/bt1;-><init>(Ljava/lang/String;Ldefpackage/jx3;I)V

    .line 685
    .line 686
    .line 687
    invoke-static {v0, v1}, Ldefpackage/rr1;->B(Ljava/lang/String;Ldefpackage/gf1;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    check-cast v0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 692
    .line 693
    goto :goto_7

    .line 694
    :cond_19
    const-string v0, "Required value was null."

    .line 695
    .line 696
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 697
    .line 698
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v1

    .line 702
    :cond_1a
    :goto_6
    iget-object v0, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 705
    .line 706
    invoke-static {v2, v0}, Ldefpackage/rr1;->z(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/WaveNextIn;)Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    :goto_7
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getTracks()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    if-nez v1, :cond_1b

    .line 715
    .line 716
    sget-object v1, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 717
    .line 718
    :cond_1b
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getContext()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-static {v2, v1}, Lcom/eddyizm/tempus/homemusic/b;->k(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    new-instance v2, Ldefpackage/kd3;

    .line 727
    .line 728
    invoke-direct {v2, v0, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 729
    .line 730
    .line 731
    goto :goto_9

    .line 732
    :goto_8
    new-instance v2, Ldefpackage/s14;

    .line 733
    .line 734
    invoke-direct {v2, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 735
    .line 736
    .line 737
    :goto_9
    sget-object v0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 738
    .line 739
    new-instance v1, Ldefpackage/v6;

    .line 740
    .line 741
    const/16 v5, 0x15

    .line 742
    .line 743
    invoke-direct {v1, v3, v4, v2, v5}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :pswitch_9
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 751
    .line 752
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v2, Landroid/content/Context;

    .line 755
    .line 756
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v0, Ljava/lang/String;

    .line 759
    .line 760
    instance-of v4, v1, Ldefpackage/s14;

    .line 761
    .line 762
    if-eqz v4, :cond_1d

    .line 763
    .line 764
    invoke-static {v1}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    if-eqz v1, :cond_1e

    .line 769
    .line 770
    const-string v4, "HubTracks"

    .line 771
    .line 772
    const-string v5, "download "

    .line 773
    .line 774
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-static {v4, v0, v1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    if-nez v0, :cond_1c

    .line 786
    .line 787
    const-string v0, ""

    .line 788
    .line 789
    :cond_1c
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-static {v2, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 802
    .line 803
    .line 804
    goto :goto_a

    .line 805
    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 809
    .line 810
    .line 811
    :cond_1e
    :goto_a
    return-void

    .line 812
    :pswitch_a
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v1, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 815
    .line 816
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v2, Ldefpackage/jx3;

    .line 819
    .line 820
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v0, Ljava/io/Serializable;

    .line 823
    .line 824
    sget-object v3, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 825
    .line 826
    iget-object v2, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v2, Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 829
    .line 830
    const-string v3, ": "

    .line 831
    .line 832
    const-string v5, "next "

    .line 833
    .line 834
    const-string v9, "HubSmart"

    .line 835
    .line 836
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setInFlight(Z)V

    .line 837
    .line 838
    .line 839
    sget-object v10, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 840
    .line 841
    if-eq v10, v1, :cond_1f

    .line 842
    .line 843
    goto/16 :goto_1a

    .line 844
    .line 845
    :cond_1f
    instance-of v10, v0, Ldefpackage/s14;

    .line 846
    .line 847
    if-nez v10, :cond_34

    .line 848
    .line 849
    move-object v10, v0

    .line 850
    check-cast v10, Ldefpackage/kd3;

    .line 851
    .line 852
    iget-object v12, v10, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v12, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 855
    .line 856
    iget-object v10, v10, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v10, Ljava/util/List;

    .line 859
    .line 860
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->sent(Lcom/eddyizm/tempus/homemusic/SmartNextIn;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setFailures(I)V

    .line 864
    .line 865
    .line 866
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 867
    .line 868
    .line 869
    move-result v2

    .line 870
    if-eqz v2, :cond_20

    .line 871
    .line 872
    :goto_b
    move-object/from16 v16, v6

    .line 873
    .line 874
    move/from16 v17, v7

    .line 875
    .line 876
    goto/16 :goto_18

    .line 877
    .line 878
    :cond_20
    sget-object v2, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 879
    .line 880
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    check-cast v2, Ldefpackage/ao2;

    .line 885
    .line 886
    if-nez v2, :cond_21

    .line 887
    .line 888
    goto :goto_b

    .line 889
    :cond_21
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Ldefpackage/qi3;

    .line 890
    .line 891
    .line 892
    move-result-object v13

    .line 893
    if-nez v13, :cond_22

    .line 894
    .line 895
    goto :goto_d

    .line 896
    :cond_22
    invoke-static {v13}, Lcom/eddyizm/tempus/homemusic/a;->j(Ldefpackage/qi3;)Z

    .line 897
    .line 898
    .line 899
    move-result v14

    .line 900
    if-eqz v14, :cond_23

    .line 901
    .line 902
    goto :goto_c

    .line 903
    :cond_23
    move-object v13, v6

    .line 904
    :goto_c
    if-eqz v13, :cond_24

    .line 905
    .line 906
    sget-object v14, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 907
    .line 908
    if-ne v14, v1, :cond_24

    .line 909
    .line 910
    goto :goto_e

    .line 911
    :cond_24
    :goto_d
    move-object v13, v6

    .line 912
    :goto_e
    if-nez v13, :cond_25

    .line 913
    .line 914
    goto :goto_b

    .line 915
    :cond_25
    invoke-static {v13}, Lcom/eddyizm/tempus/homemusic/a;->e(Ldefpackage/qi3;)Ljava/util/ArrayList;

    .line 916
    .line 917
    .line 918
    move-result-object v14

    .line 919
    new-instance v15, Ljava/util/ArrayList;

    .line 920
    .line 921
    move-object/from16 v16, v6

    .line 922
    .line 923
    const/16 v6, 0xa

    .line 924
    .line 925
    move/from16 v17, v7

    .line 926
    .line 927
    invoke-static {v14, v6}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 928
    .line 929
    .line 930
    move-result v7

    .line 931
    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 935
    .line 936
    .line 937
    move-result v7

    .line 938
    move v4, v8

    .line 939
    :goto_f
    if-ge v4, v7, :cond_26

    .line 940
    .line 941
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v18

    .line 945
    add-int/lit8 v4, v4, 0x1

    .line 946
    .line 947
    move-object/from16 v8, v18

    .line 948
    .line 949
    check-cast v8, Ldefpackage/gn2;

    .line 950
    .line 951
    new-instance v11, Ldefpackage/s11;

    .line 952
    .line 953
    iget-object v6, v8, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 954
    .line 955
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    iget-object v8, v8, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 959
    .line 960
    invoke-virtual {v1, v8}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 961
    .line 962
    .line 963
    move-result v8

    .line 964
    invoke-direct {v11, v6, v8}, Ldefpackage/s11;-><init>(Ljava/lang/String;Z)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    const/16 v6, 0xa

    .line 971
    .line 972
    const/4 v8, 0x0

    .line 973
    goto :goto_f

    .line 974
    :cond_26
    sget-object v4, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 975
    .line 976
    invoke-interface {v13}, Ldefpackage/qi3;->o0()I

    .line 977
    .line 978
    .line 979
    move-result v6

    .line 980
    new-instance v7, Ljava/util/ArrayList;

    .line 981
    .line 982
    const/16 v8, 0xa

    .line 983
    .line 984
    invoke-static {v10, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 985
    .line 986
    .line 987
    move-result v11

    .line 988
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 989
    .line 990
    .line 991
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 992
    .line 993
    .line 994
    move-result-object v8

    .line 995
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 996
    .line 997
    .line 998
    move-result v11

    .line 999
    if-eqz v11, :cond_27

    .line 1000
    .line 1001
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v11

    .line 1005
    check-cast v11, Ldefpackage/dt1;

    .line 1006
    .line 1007
    iget-object v11, v11, Ldefpackage/dt1;->a:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1008
    .line 1009
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    goto :goto_10

    .line 1013
    :cond_27
    invoke-virtual {v4, v15, v6, v7}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->insertions(Ljava/util/List;ILjava/util/List;)Ljava/util/List;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    if-eqz v6, :cond_28

    .line 1022
    .line 1023
    goto/16 :goto_18

    .line 1024
    .line 1025
    :cond_28
    const/16 v8, 0xa

    .line 1026
    .line 1027
    invoke-static {v10, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 1028
    .line 1029
    .line 1030
    move-result v6

    .line 1031
    invoke-static {v6}, Ldefpackage/lg2;->W(I)I

    .line 1032
    .line 1033
    .line 1034
    move-result v6

    .line 1035
    const/16 v7, 0x10

    .line 1036
    .line 1037
    if-ge v6, v7, :cond_29

    .line 1038
    .line 1039
    move v6, v7

    .line 1040
    :cond_29
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 1041
    .line 1042
    invoke-direct {v8, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1043
    .line 1044
    .line 1045
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v6

    .line 1049
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v11

    .line 1053
    if-eqz v11, :cond_2a

    .line 1054
    .line 1055
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v11

    .line 1059
    move-object v13, v11

    .line 1060
    check-cast v13, Ldefpackage/dt1;

    .line 1061
    .line 1062
    iget-object v13, v13, Ldefpackage/dt1;->a:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1063
    .line 1064
    invoke-virtual {v13}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v13

    .line 1068
    invoke-interface {v8, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    goto :goto_11

    .line 1072
    :cond_2a
    new-instance v6, Ljava/util/ArrayList;

    .line 1073
    .line 1074
    const/16 v11, 0xa

    .line 1075
    .line 1076
    invoke-static {v4, v11}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 1077
    .line 1078
    .line 1079
    move-result v13

    .line 1080
    invoke-direct {v6, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v11

    .line 1087
    :goto_12
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v13

    .line 1091
    if-eqz v13, :cond_2b

    .line 1092
    .line 1093
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v13

    .line 1097
    check-cast v13, Ldefpackage/kd3;

    .line 1098
    .line 1099
    iget-object v13, v13, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v13, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1102
    .line 1103
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    goto :goto_12

    .line 1107
    :cond_2b
    invoke-virtual {v1, v6}, Lcom/eddyizm/tempus/homemusic/SmartSession;->register(Ljava/util/List;)Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v6

    .line 1111
    sget-object v11, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 1112
    .line 1113
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 1114
    .line 1115
    const/16 v13, 0xa

    .line 1116
    .line 1117
    invoke-static {v6, v13}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 1118
    .line 1119
    .line 1120
    move-result v14

    .line 1121
    invoke-static {v14}, Ldefpackage/lg2;->W(I)I

    .line 1122
    .line 1123
    .line 1124
    move-result v13

    .line 1125
    if-ge v13, v7, :cond_2c

    .line 1126
    .line 1127
    goto :goto_13

    .line 1128
    :cond_2c
    move v7, v13

    .line 1129
    :goto_13
    invoke-direct {v11, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v6

    .line 1136
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v7

    .line 1140
    if-eqz v7, :cond_2d

    .line 1141
    .line 1142
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v7

    .line 1146
    move-object v13, v7

    .line 1147
    check-cast v13, Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getRecContext()Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v13

    .line 1153
    invoke-interface {v11, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    goto :goto_14

    .line 1157
    :cond_2d
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/a;->f(Lcom/eddyizm/tempus/homemusic/SmartSession;)Ljava/util/Map;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v6

    .line 1161
    invoke-static {v11, v6}, Ldefpackage/rs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v6

    .line 1168
    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1169
    .line 1170
    .line 1171
    move-result v7

    .line 1172
    if-eqz v7, :cond_2f

    .line 1173
    .line 1174
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v7

    .line 1178
    check-cast v7, Ldefpackage/kd3;

    .line 1179
    .line 1180
    iget-object v11, v7, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v11, Ljava/lang/Number;

    .line 1183
    .line 1184
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1185
    .line 1186
    .line 1187
    move-result v11

    .line 1188
    iget-object v7, v7, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 1189
    .line 1190
    check-cast v7, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1191
    .line 1192
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v7

    .line 1196
    invoke-virtual {v8, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v7

    .line 1200
    check-cast v7, Ldefpackage/dt1;

    .line 1201
    .line 1202
    if-nez v7, :cond_2e

    .line 1203
    .line 1204
    goto :goto_15

    .line 1205
    :cond_2e
    iget-object v13, v7, Ldefpackage/dt1;->b:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 1206
    .line 1207
    invoke-static {v13}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v13

    .line 1211
    iget-object v7, v7, Ldefpackage/dt1;->c:Ldefpackage/gn2;

    .line 1212
    .line 1213
    invoke-static {v7}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v7

    .line 1217
    invoke-static {v2, v11, v13, v7}, Ldefpackage/bo2;->h(Ldefpackage/ao2;ILjava/util/List;Ljava/util/List;)V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_15

    .line 1221
    :cond_2f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    new-instance v6, Ljava/util/ArrayList;

    .line 1226
    .line 1227
    const/16 v8, 0xa

    .line 1228
    .line 1229
    invoke-static {v4, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 1230
    .line 1231
    .line 1232
    move-result v7

    .line 1233
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1234
    .line 1235
    .line 1236
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v7

    .line 1240
    :goto_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1241
    .line 1242
    .line 1243
    move-result v8

    .line 1244
    if-eqz v8, :cond_30

    .line 1245
    .line 1246
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v8

    .line 1250
    check-cast v8, Ldefpackage/kd3;

    .line 1251
    .line 1252
    iget-object v8, v8, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 1253
    .line 1254
    check-cast v8, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1255
    .line 1256
    invoke-virtual {v8}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getRef()Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v8

    .line 1260
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    goto :goto_16

    .line 1264
    :cond_30
    new-instance v7, Ljava/util/ArrayList;

    .line 1265
    .line 1266
    const/16 v8, 0xa

    .line 1267
    .line 1268
    invoke-static {v4, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 1269
    .line 1270
    .line 1271
    move-result v8

    .line 1272
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v4

    .line 1279
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1280
    .line 1281
    .line 1282
    move-result v8

    .line 1283
    if-eqz v8, :cond_31

    .line 1284
    .line 1285
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v8

    .line 1289
    check-cast v8, Ldefpackage/kd3;

    .line 1290
    .line 1291
    iget-object v8, v8, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 1292
    .line 1293
    check-cast v8, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 1294
    .line 1295
    invoke-virtual {v8}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getAfter()Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v8

    .line 1299
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    goto :goto_17

    .line 1303
    :cond_31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    .line 1317
    const-string v2, " after "

    .line 1318
    .line 1319
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    invoke-static {v9, v2}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1330
    .line 1331
    .line 1332
    :goto_18
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getAgain()Z

    .line 1333
    .line 1334
    .line 1335
    move-result v2

    .line 1336
    if-eqz v2, :cond_32

    .line 1337
    .line 1338
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->b()V

    .line 1339
    .line 1340
    .line 1341
    goto/16 :goto_1a

    .line 1342
    .line 1343
    :cond_32
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v2

    .line 1347
    if-eqz v2, :cond_33

    .line 1348
    .line 1349
    invoke-virtual {v12}, Lcom/eddyizm/tempus/homemusic/SmartOut;->getPending()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    if-eqz v2, :cond_33

    .line 1354
    .line 1355
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getPolls()I

    .line 1356
    .line 1357
    .line 1358
    move-result v2

    .line 1359
    add-int/lit8 v2, v2, 0x1

    .line 1360
    .line 1361
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setPolls(I)V

    .line 1362
    .line 1363
    .line 1364
    sget-object v2, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 1365
    .line 1366
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getPolls()I

    .line 1367
    .line 1368
    .line 1369
    move-result v4

    .line 1370
    invoke-virtual {v2, v4}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterPending(I)Ljava/lang/Long;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    if-eqz v2, :cond_35

    .line 1375
    .line 1376
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v6

    .line 1380
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 1381
    .line 1382
    .line 1383
    new-instance v2, Ldefpackage/u6;

    .line 1384
    .line 1385
    const/16 v4, 0xb

    .line 1386
    .line 1387
    invoke-direct {v2, v4}, Ldefpackage/u6;-><init>(I)V

    .line 1388
    .line 1389
    .line 1390
    sput-object v2, Lcom/eddyizm/tempus/homemusic/a;->c:Ldefpackage/u6;

    .line 1391
    .line 1392
    sget-object v4, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 1393
    .line 1394
    invoke-virtual {v4, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1395
    .line 1396
    .line 1397
    goto :goto_19

    .line 1398
    :cond_33
    const/4 v2, 0x0

    .line 1399
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setPolls(I)V

    .line 1400
    .line 1401
    .line 1402
    goto :goto_19

    .line 1403
    :cond_34
    move-object/from16 v16, v6

    .line 1404
    .line 1405
    move/from16 v17, v7

    .line 1406
    .line 1407
    :cond_35
    :goto_19
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    if-eqz v0, :cond_38

    .line 1412
    .line 1413
    instance-of v2, v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1414
    .line 1415
    if-eqz v2, :cond_36

    .line 1416
    .line 1417
    move-object v4, v0

    .line 1418
    check-cast v4, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1419
    .line 1420
    iget v4, v4, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 1421
    .line 1422
    const/16 v6, 0x194

    .line 1423
    .line 1424
    if-ne v4, v6, :cond_36

    .line 1425
    .line 1426
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->expire()V

    .line 1427
    .line 1428
    .line 1429
    sput-object v16, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 1430
    .line 1431
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 1432
    .line 1433
    .line 1434
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 1435
    .line 1436
    .line 1437
    goto :goto_1a

    .line 1438
    :cond_36
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1447
    .line 1448
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    invoke-static {v9, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1465
    .line 1466
    .line 1467
    if-nez v2, :cond_37

    .line 1468
    .line 1469
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 1470
    .line 1471
    .line 1472
    :cond_37
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getFailures()I

    .line 1473
    .line 1474
    .line 1475
    move-result v0

    .line 1476
    add-int/lit8 v0, v0, 0x1

    .line 1477
    .line 1478
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setFailures(I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getAgain()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v0

    .line 1485
    if-eqz v0, :cond_38

    .line 1486
    .line 1487
    sget-object v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 1488
    .line 1489
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getFailures()I

    .line 1490
    .line 1491
    .line 1492
    move-result v1

    .line 1493
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterFailure(I)Ljava/lang/Long;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    if-eqz v0, :cond_38

    .line 1498
    .line 1499
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1500
    .line 1501
    .line 1502
    move-result-wide v0

    .line 1503
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 1504
    .line 1505
    .line 1506
    new-instance v2, Ldefpackage/u6;

    .line 1507
    .line 1508
    const/16 v4, 0xb

    .line 1509
    .line 1510
    invoke-direct {v2, v4}, Ldefpackage/u6;-><init>(I)V

    .line 1511
    .line 1512
    .line 1513
    sput-object v2, Lcom/eddyizm/tempus/homemusic/a;->c:Ldefpackage/u6;

    .line 1514
    .line 1515
    sget-object v3, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 1516
    .line 1517
    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1518
    .line 1519
    .line 1520
    :cond_38
    :goto_1a
    return-void

    .line 1521
    :pswitch_b
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v1, Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 1524
    .line 1525
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1526
    .line 1527
    check-cast v2, Ljava/lang/String;

    .line 1528
    .line 1529
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1530
    .line 1531
    move-object v3, v0

    .line 1532
    check-cast v3, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 1533
    .line 1534
    new-instance v4, Ldefpackage/jx3;

    .line 1535
    .line 1536
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1537
    .line 1538
    .line 1539
    iput-object v1, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1540
    .line 1541
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 1542
    .line 1543
    :try_start_2
    sget-object v0, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 1544
    .line 1545
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    sget-object v5, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 1550
    .line 1551
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v5

    .line 1555
    const-string v6, "typed_favorites_v1"

    .line 1556
    .line 1557
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v5

    .line 1561
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v6

    .line 1565
    const-string v7, "favorite_compensation_chains_v1"

    .line 1566
    .line 1567
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1568
    .line 1569
    .line 1570
    move-result v6

    .line 1571
    invoke-virtual {v1, v5, v6, v0}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;->compatible(ZZLjava/lang/String;)Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v1

    .line 1575
    iput-object v1, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1576
    .line 1577
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;->getPlayed()Ljava/util/List;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v1

    .line 1581
    if-eqz v1, :cond_39

    .line 1582
    .line 1583
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1584
    .line 1585
    .line 1586
    move-result v5

    .line 1587
    if-eqz v5, :cond_39

    .line 1588
    .line 1589
    goto :goto_1b

    .line 1590
    :catchall_2
    move-exception v0

    .line 1591
    goto :goto_1d

    .line 1592
    :cond_39
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v1

    .line 1596
    :cond_3a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1597
    .line 1598
    .line 1599
    move-result v5

    .line 1600
    if-eqz v5, :cond_3c

    .line 1601
    .line 1602
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v5

    .line 1606
    check-cast v5, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 1607
    .line 1608
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v5

    .line 1612
    if-eqz v5, :cond_3a

    .line 1613
    .line 1614
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 1615
    .line 1616
    if-eqz v0, :cond_3b

    .line 1617
    .line 1618
    new-instance v1, Ldefpackage/bt1;

    .line 1619
    .line 1620
    const/4 v5, 0x0

    .line 1621
    invoke-direct {v1, v2, v4, v5}, Ldefpackage/bt1;-><init>(Ljava/lang/String;Ldefpackage/jx3;I)V

    .line 1622
    .line 1623
    .line 1624
    invoke-static {v0, v1}, Ldefpackage/rr1;->B(Ljava/lang/String;Ldefpackage/gf1;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 1629
    .line 1630
    goto :goto_1c

    .line 1631
    :cond_3b
    const-string v0, "Required value was null."

    .line 1632
    .line 1633
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1634
    .line 1635
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1636
    .line 1637
    .line 1638
    throw v1

    .line 1639
    :cond_3c
    :goto_1b
    iget-object v0, v4, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1640
    .line 1641
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 1642
    .line 1643
    invoke-static {v2, v0}, Ldefpackage/rr1;->v(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartNextIn;)Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v0

    .line 1647
    :goto_1c
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/SmartOut;->getRecs()Ljava/util/List;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v1

    .line 1651
    if-nez v1, :cond_3d

    .line 1652
    .line 1653
    sget-object v1, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 1654
    .line 1655
    :cond_3d
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/a;->l(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v1

    .line 1659
    new-instance v2, Ldefpackage/kd3;

    .line 1660
    .line 1661
    invoke-direct {v2, v0, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1662
    .line 1663
    .line 1664
    goto :goto_1e

    .line 1665
    :goto_1d
    new-instance v2, Ldefpackage/s14;

    .line 1666
    .line 1667
    invoke-direct {v2, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 1668
    .line 1669
    .line 1670
    :goto_1e
    sget-object v0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 1671
    .line 1672
    new-instance v1, Ldefpackage/v6;

    .line 1673
    .line 1674
    const/16 v5, 0x12

    .line 1675
    .line 1676
    invoke-direct {v1, v3, v4, v2, v5}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1680
    .line 1681
    .line 1682
    return-void

    .line 1683
    :pswitch_c
    move-object/from16 v16, v6

    .line 1684
    .line 1685
    move/from16 v17, v7

    .line 1686
    .line 1687
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1688
    .line 1689
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubShareActivity;

    .line 1690
    .line 1691
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1692
    .line 1693
    check-cast v2, Ldefpackage/jx3;

    .line 1694
    .line 1695
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v0, Ljava/lang/String;

    .line 1698
    .line 1699
    sget-object v3, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Ldefpackage/ux3;

    .line 1700
    .line 1701
    iget-object v2, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1702
    .line 1703
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1704
    .line 1705
    .line 1706
    check-cast v2, Ljava/lang/String;

    .line 1707
    .line 1708
    invoke-static {v0}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v3

    .line 1712
    if-eqz v3, :cond_3e

    .line 1713
    .line 1714
    move-object/from16 v6, v16

    .line 1715
    .line 1716
    goto :goto_1f

    .line 1717
    :cond_3e
    move-object v6, v0

    .line 1718
    :goto_1f
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v0

    .line 1722
    if-nez v0, :cond_41

    .line 1723
    .line 1724
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v0

    .line 1728
    if-eqz v0, :cond_3f

    .line 1729
    .line 1730
    goto :goto_20

    .line 1731
    :cond_3f
    if-eqz v6, :cond_40

    .line 1732
    .line 1733
    move/from16 v3, v17

    .line 1734
    .line 1735
    invoke-static {v1, v6, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v0

    .line 1739
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1740
    .line 1741
    .line 1742
    :cond_40
    new-instance v0, Landroid/content/Intent;

    .line 1743
    .line 1744
    const-class v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1745
    .line 1746
    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1747
    .line 1748
    .line 1749
    const/high16 v3, 0x34000000

    .line 1750
    .line 1751
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v0

    .line 1755
    const-string v3, "homemusic_hub_route"

    .line 1756
    .line 1757
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v0

    .line 1761
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 1765
    .line 1766
    .line 1767
    :cond_41
    :goto_20
    return-void

    .line 1768
    :pswitch_d
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1769
    .line 1770
    check-cast v1, Ldefpackage/vb4;

    .line 1771
    .line 1772
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1773
    .line 1774
    check-cast v2, Landroidx/preference/Preference;

    .line 1775
    .line 1776
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1777
    .line 1778
    check-cast v0, Ljava/lang/String;

    .line 1779
    .line 1780
    invoke-virtual {v1}, Ldefpackage/kc1;->y()Z

    .line 1781
    .line 1782
    .line 1783
    move-result v1

    .line 1784
    if-eqz v1, :cond_42

    .line 1785
    .line 1786
    invoke-virtual {v2, v0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 1787
    .line 1788
    .line 1789
    :cond_42
    return-void

    .line 1790
    :pswitch_e
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v1, Ldefpackage/cp1;

    .line 1793
    .line 1794
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast v2, [Z

    .line 1797
    .line 1798
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v0, Ljava/util/List;

    .line 1801
    .line 1802
    const/4 v5, 0x0

    .line 1803
    aget-boolean v3, v2, v5

    .line 1804
    .line 1805
    if-eqz v3, :cond_43

    .line 1806
    .line 1807
    goto :goto_21

    .line 1808
    :cond_43
    iget-object v1, v1, Ldefpackage/cp1;->F0:Ldefpackage/bl2;

    .line 1809
    .line 1810
    invoke-static {v1, v0, v5}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 1811
    .line 1812
    .line 1813
    const/16 v17, 0x1

    .line 1814
    .line 1815
    aput-boolean v17, v2, v5

    .line 1816
    .line 1817
    :goto_21
    return-void

    .line 1818
    :pswitch_f
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1819
    .line 1820
    check-cast v1, Ldefpackage/cp1;

    .line 1821
    .line 1822
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1823
    .line 1824
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 1825
    .line 1826
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v0, Landroid/view/View;

    .line 1829
    .line 1830
    iget-object v1, v1, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 1831
    .line 1832
    if-eqz v1, :cond_45

    .line 1833
    .line 1834
    if-nez v2, :cond_44

    .line 1835
    .line 1836
    goto :goto_22

    .line 1837
    :cond_44
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1838
    .line 1839
    .line 1840
    invoke-static {v0, v2}, Ldefpackage/ud3;->E0(Landroid/view/View;Lcom/eddyizm/tempus/homemusic/HubMixToday;)V

    .line 1841
    .line 1842
    .line 1843
    :cond_45
    :goto_22
    return-void

    .line 1844
    :pswitch_10
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1845
    .line 1846
    check-cast v1, Ldefpackage/fo1;

    .line 1847
    .line 1848
    iget-object v3, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1849
    .line 1850
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1851
    .line 1852
    check-cast v0, Ldefpackage/gf1;

    .line 1853
    .line 1854
    invoke-virtual {v1}, Ldefpackage/fo1;->c()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v4

    .line 1858
    if-nez v4, :cond_46

    .line 1859
    .line 1860
    goto :goto_23

    .line 1861
    :cond_46
    instance-of v4, v3, Ldefpackage/s14;

    .line 1862
    .line 1863
    if-nez v4, :cond_47

    .line 1864
    .line 1865
    move-object v4, v3

    .line 1866
    check-cast v4, Ldefpackage/kd3;

    .line 1867
    .line 1868
    iget-object v5, v4, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 1869
    .line 1870
    check-cast v5, Ljava/lang/String;

    .line 1871
    .line 1872
    iget-object v4, v4, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 1873
    .line 1874
    check-cast v4, Ljava/lang/String;

    .line 1875
    .line 1876
    invoke-virtual {v1, v5, v4}, Ldefpackage/fo1;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 1877
    .line 1878
    .line 1879
    :cond_47
    invoke-static {v3}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v3

    .line 1883
    if-eqz v3, :cond_4a

    .line 1884
    .line 1885
    const/4 v5, 0x0

    .line 1886
    invoke-virtual {v1, v5}, Ldefpackage/fo1;->r(Z)V

    .line 1887
    .line 1888
    .line 1889
    instance-of v4, v3, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1890
    .line 1891
    if-eqz v4, :cond_48

    .line 1892
    .line 1893
    move-object v4, v3

    .line 1894
    check-cast v4, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1895
    .line 1896
    iget v4, v4, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 1897
    .line 1898
    const/16 v5, 0x199

    .line 1899
    .line 1900
    if-ne v4, v5, :cond_48

    .line 1901
    .line 1902
    if-eqz v0, :cond_48

    .line 1903
    .line 1904
    invoke-interface {v0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    goto :goto_23

    .line 1908
    :cond_48
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v0

    .line 1912
    if-nez v0, :cond_49

    .line 1913
    .line 1914
    const/4 v5, 0x0

    .line 1915
    new-array v0, v5, [Ljava/lang/Object;

    .line 1916
    .line 1917
    invoke-virtual {v1, v2, v0}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v0

    .line 1921
    :cond_49
    invoke-virtual {v1, v0}, Ldefpackage/fo1;->t(Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    :cond_4a
    :goto_23
    return-void

    .line 1925
    :pswitch_11
    move-object/from16 v16, v6

    .line 1926
    .line 1927
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1928
    .line 1929
    check-cast v1, Ldefpackage/fo1;

    .line 1930
    .line 1931
    iget-object v3, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 1932
    .line 1933
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v0, Ljava/lang/String;

    .line 1936
    .line 1937
    invoke-virtual {v1}, Ldefpackage/fo1;->c()Z

    .line 1938
    .line 1939
    .line 1940
    move-result v4

    .line 1941
    if-nez v4, :cond_4b

    .line 1942
    .line 1943
    goto :goto_24

    .line 1944
    :cond_4b
    const/4 v5, 0x0

    .line 1945
    invoke-virtual {v1, v5}, Ldefpackage/fo1;->r(Z)V

    .line 1946
    .line 1947
    .line 1948
    instance-of v4, v3, Ldefpackage/s14;

    .line 1949
    .line 1950
    if-eqz v4, :cond_4d

    .line 1951
    .line 1952
    invoke-static {v3}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v0

    .line 1956
    if-eqz v0, :cond_4e

    .line 1957
    .line 1958
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    if-nez v0, :cond_4c

    .line 1963
    .line 1964
    new-array v0, v5, [Ljava/lang/Object;

    .line 1965
    .line 1966
    invoke-virtual {v1, v2, v0}, Ldefpackage/fo1;->v(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v0

    .line 1970
    :cond_4c
    invoke-virtual {v1, v0}, Ldefpackage/fo1;->t(Ljava/lang/String;)V

    .line 1971
    .line 1972
    .line 1973
    goto :goto_24

    .line 1974
    :cond_4d
    if-eqz v3, :cond_4f

    .line 1975
    .line 1976
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 1977
    .line 1978
    .line 1979
    :cond_4e
    :goto_24
    return-void

    .line 1980
    :cond_4f
    iget-object v2, v1, Ldefpackage/fo1;->c:Ljava/lang/Object;

    .line 1981
    .line 1982
    check-cast v2, Ldefpackage/uc1;

    .line 1983
    .line 1984
    iget-object v2, v2, Ldefpackage/uc1;->c:Lcom/google/android/material/textfield/TextInputEditText;

    .line 1985
    .line 1986
    move-object/from16 v3, v16

    .line 1987
    .line 1988
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1989
    .line 1990
    .line 1991
    iput-object v0, v1, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 1992
    .line 1993
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1994
    .line 1995
    .line 1996
    throw v3

    .line 1997
    :pswitch_12
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 1998
    .line 1999
    check-cast v1, Ldefpackage/gf1;

    .line 2000
    .line 2001
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2002
    .line 2003
    check-cast v2, Ldefpackage/fo1;

    .line 2004
    .line 2005
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2006
    .line 2007
    move-object v3, v0

    .line 2008
    check-cast v3, Ldefpackage/gf1;

    .line 2009
    .line 2010
    :try_start_3
    invoke-interface {v1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2014
    goto :goto_25

    .line 2015
    :catchall_3
    move-exception v0

    .line 2016
    new-instance v1, Ldefpackage/s14;

    .line 2017
    .line 2018
    invoke-direct {v1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 2019
    .line 2020
    .line 2021
    move-object v0, v1

    .line 2022
    :goto_25
    sget-object v1, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 2023
    .line 2024
    new-instance v4, Ldefpackage/v6;

    .line 2025
    .line 2026
    invoke-direct {v4, v2, v0, v3, v5}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 2027
    .line 2028
    .line 2029
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2030
    .line 2031
    .line 2032
    return-void

    .line 2033
    :pswitch_13
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2034
    .line 2035
    check-cast v1, Ldefpackage/vj;

    .line 2036
    .line 2037
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2038
    .line 2039
    check-cast v2, Ldefpackage/bu;

    .line 2040
    .line 2041
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2042
    .line 2043
    move-object v3, v0

    .line 2044
    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2045
    .line 2046
    :try_start_4
    iget-object v0, v1, Ldefpackage/vj;->n:Landroid/content/Context;

    .line 2047
    .line 2048
    invoke-static {v0}, Ldefpackage/si0;->o(Landroid/content/Context;)Ldefpackage/sa1;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v0

    .line 2052
    if-eqz v0, :cond_50

    .line 2053
    .line 2054
    iget-object v1, v0, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 2055
    .line 2056
    check-cast v1, Ldefpackage/sz0;

    .line 2057
    .line 2058
    check-cast v1, Ldefpackage/ra1;

    .line 2059
    .line 2060
    iget-object v4, v1, Ldefpackage/ra1;->q:Ljava/lang/Object;

    .line 2061
    .line 2062
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2063
    :try_start_5
    iput-object v3, v1, Ldefpackage/ra1;->s:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2064
    .line 2065
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 2066
    :try_start_6
    iget-object v0, v0, Ldefpackage/qz0;->b:Ljava/lang/Object;

    .line 2067
    .line 2068
    check-cast v0, Ldefpackage/sz0;

    .line 2069
    .line 2070
    new-instance v1, Ldefpackage/vz0;

    .line 2071
    .line 2072
    invoke-direct {v1, v2, v3}, Ldefpackage/vz0;-><init>(Ldefpackage/bu;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 2073
    .line 2074
    .line 2075
    invoke-interface {v0, v1}, Ldefpackage/sz0;->a(Ldefpackage/bu;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 2076
    .line 2077
    .line 2078
    goto :goto_27

    .line 2079
    :catchall_4
    move-exception v0

    .line 2080
    goto :goto_26

    .line 2081
    :catchall_5
    move-exception v0

    .line 2082
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 2083
    :try_start_8
    throw v0

    .line 2084
    :cond_50
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2085
    .line 2086
    const-string v1, "EmojiCompat font provider not available on this device."

    .line 2087
    .line 2088
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2089
    .line 2090
    .line 2091
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 2092
    :goto_26
    invoke-virtual {v2, v0}, Ldefpackage/bu;->u(Ljava/lang/Throwable;)V

    .line 2093
    .line 2094
    .line 2095
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 2096
    .line 2097
    .line 2098
    :goto_27
    return-void

    .line 2099
    :pswitch_14
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2100
    .line 2101
    check-cast v1, Ldefpackage/sw0;

    .line 2102
    .line 2103
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2104
    .line 2105
    check-cast v2, Ldefpackage/tw0;

    .line 2106
    .line 2107
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2108
    .line 2109
    check-cast v0, Ldefpackage/tv1;

    .line 2110
    .line 2111
    iget v3, v1, Ldefpackage/sw0;->a:I

    .line 2112
    .line 2113
    iget-object v1, v1, Ldefpackage/sw0;->b:Ldefpackage/mt2;

    .line 2114
    .line 2115
    invoke-interface {v2, v3, v1, v0}, Ldefpackage/tw0;->D(ILdefpackage/mt2;Ldefpackage/tv1;)V

    .line 2116
    .line 2117
    .line 2118
    return-void

    .line 2119
    :pswitch_15
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2120
    .line 2121
    check-cast v1, Ldefpackage/sw0;

    .line 2122
    .line 2123
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2124
    .line 2125
    check-cast v2, Ldefpackage/tw0;

    .line 2126
    .line 2127
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2128
    .line 2129
    check-cast v0, Ljava/lang/Exception;

    .line 2130
    .line 2131
    iget v3, v1, Ldefpackage/sw0;->a:I

    .line 2132
    .line 2133
    iget-object v1, v1, Ldefpackage/sw0;->b:Ldefpackage/mt2;

    .line 2134
    .line 2135
    invoke-interface {v2, v3, v1, v0}, Ldefpackage/tw0;->c(ILdefpackage/mt2;Ljava/lang/Exception;)V

    .line 2136
    .line 2137
    .line 2138
    return-void

    .line 2139
    :pswitch_16
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2140
    .line 2141
    check-cast v1, Ldefpackage/xm0;

    .line 2142
    .line 2143
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2144
    .line 2145
    check-cast v2, Landroid/view/View;

    .line 2146
    .line 2147
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2148
    .line 2149
    check-cast v0, Ldefpackage/tm0;

    .line 2150
    .line 2151
    iget-object v1, v1, Ldefpackage/xm0;->a:Landroid/view/ViewGroup;

    .line 2152
    .line 2153
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2154
    .line 2155
    .line 2156
    invoke-virtual {v0}, Ldefpackage/b3;->d()V

    .line 2157
    .line 2158
    .line 2159
    return-void

    .line 2160
    :pswitch_17
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2161
    .line 2162
    check-cast v1, Ljava/lang/String;

    .line 2163
    .line 2164
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2165
    .line 2166
    check-cast v2, Ldefpackage/vz;

    .line 2167
    .line 2168
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2169
    .line 2170
    check-cast v0, Ldefpackage/yz;

    .line 2171
    .line 2172
    sget-object v4, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 2173
    .line 2174
    invoke-static {}, Ldefpackage/b00;->b()Ldefpackage/kd3;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v5

    .line 2178
    if-eqz v5, :cond_51

    .line 2179
    .line 2180
    iget-object v5, v5, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 2181
    .line 2182
    check-cast v5, Ljava/lang/String;

    .line 2183
    .line 2184
    goto :goto_28

    .line 2185
    :cond_51
    const/4 v5, 0x0

    .line 2186
    :goto_28
    invoke-static {v5, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2187
    .line 2188
    .line 2189
    move-result v1

    .line 2190
    if-eqz v1, :cond_56

    .line 2191
    .line 2192
    monitor-enter v4

    .line 2193
    :try_start_9
    sget-object v1, Ldefpackage/b00;->f:Ljava/util/LinkedHashMap;

    .line 2194
    .line 2195
    iget-object v5, v2, Ldefpackage/vz;->f:Ljava/lang/String;

    .line 2196
    .line 2197
    invoke-interface {v1, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v1

    .line 2201
    check-cast v1, Ldefpackage/a00;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 2202
    .line 2203
    monitor-exit v4

    .line 2204
    if-eqz v1, :cond_52

    .line 2205
    .line 2206
    iget-object v4, v1, Ldefpackage/a00;->c:Ldefpackage/l61;

    .line 2207
    .line 2208
    invoke-static {v4}, Ldefpackage/n61;->l(Ldefpackage/l61;)V

    .line 2209
    .line 2210
    .line 2211
    iget-object v4, v1, Ldefpackage/a00;->a:Ljava/lang/String;

    .line 2212
    .line 2213
    iget-boolean v1, v1, Ldefpackage/a00;->b:Z

    .line 2214
    .line 2215
    const/4 v5, 0x1

    .line 2216
    invoke-static {v5, v4, v1}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 2217
    .line 2218
    .line 2219
    move-result v1

    .line 2220
    goto :goto_29

    .line 2221
    :cond_52
    iget-boolean v1, v2, Ldefpackage/vz;->e:Z

    .line 2222
    .line 2223
    :goto_29
    const-string v4, "hm:hub-favorite"

    .line 2224
    .line 2225
    const-string v5, "ref"

    .line 2226
    .line 2227
    iget-object v2, v2, Ldefpackage/vz;->c:Ljava/lang/String;

    .line 2228
    .line 2229
    new-instance v6, Ldefpackage/kd3;

    .line 2230
    .line 2231
    invoke-direct {v6, v5, v2}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2232
    .line 2233
    .line 2234
    const-string v2, "star"

    .line 2235
    .line 2236
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v1

    .line 2240
    new-instance v5, Ldefpackage/kd3;

    .line 2241
    .line 2242
    invoke-direct {v5, v2, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2243
    .line 2244
    .line 2245
    filled-new-array {v6, v5}, [Ldefpackage/kd3;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v1

    .line 2249
    invoke-static {v1}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    sget-object v2, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 2254
    .line 2255
    sget-object v5, Ldefpackage/hw;->g:Landroid/webkit/WebView;

    .line 2256
    .line 2257
    if-eqz v5, :cond_53

    .line 2258
    .line 2259
    invoke-virtual {v2, v4}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v4

    .line 2263
    invoke-virtual {v2, v1}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v1

    .line 2267
    const-string v2, "window.dispatchEvent(new CustomEvent("

    .line 2268
    .line 2269
    const-string v6, ", {detail: "

    .line 2270
    .line 2271
    const-string v7, "}));"

    .line 2272
    .line 2273
    invoke-static {v2, v4, v6, v1, v7}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v1

    .line 2277
    const/4 v2, 0x0

    .line 2278
    invoke-virtual {v5, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 2279
    .line 2280
    .line 2281
    :cond_53
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v1

    .line 2285
    iget-object v0, v0, Ldefpackage/yz;->c:Lcom/eddyizm/tempus/homemusic/HubException;

    .line 2286
    .line 2287
    if-eqz v0, :cond_54

    .line 2288
    .line 2289
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v0

    .line 2293
    if-nez v0, :cond_55

    .line 2294
    .line 2295
    :cond_54
    const-string v0, ""

    .line 2296
    .line 2297
    :cond_55
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v0

    .line 2301
    invoke-virtual {v1, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v0

    .line 2305
    const/4 v3, 0x1

    .line 2306
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v0

    .line 2310
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2311
    .line 2312
    .line 2313
    goto :goto_2a

    .line 2314
    :catchall_6
    move-exception v0

    .line 2315
    monitor-exit v4

    .line 2316
    throw v0

    .line 2317
    :cond_56
    :goto_2a
    return-void

    .line 2318
    :pswitch_18
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2319
    .line 2320
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 2321
    .line 2322
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2323
    .line 2324
    check-cast v2, Ljava/lang/String;

    .line 2325
    .line 2326
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2327
    .line 2328
    check-cast v0, Ldefpackage/sc5;

    .line 2329
    .line 2330
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->A()Ldefpackage/fd5;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v1

    .line 2334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2335
    .line 2336
    .line 2337
    const-string v3, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 2338
    .line 2339
    const/4 v5, 0x1

    .line 2340
    invoke-static {v5, v3}, Ldefpackage/w24;->b(ILjava/lang/String;)Ldefpackage/w24;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v3

    .line 2344
    invoke-virtual {v3, v5, v2}, Ldefpackage/w24;->h(ILjava/lang/String;)V

    .line 2345
    .line 2346
    .line 2347
    iget-object v1, v1, Ldefpackage/fd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 2348
    .line 2349
    invoke-virtual {v1}, Ldefpackage/s24;->b()V

    .line 2350
    .line 2351
    .line 2352
    invoke-static {v1, v3}, Ldefpackage/xl;->H(Ldefpackage/s24;Ldefpackage/wo4;)Landroid/database/Cursor;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v1

    .line 2356
    :try_start_a
    new-instance v2, Ljava/util/ArrayList;

    .line 2357
    .line 2358
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    .line 2359
    .line 2360
    .line 2361
    move-result v4

    .line 2362
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2363
    .line 2364
    .line 2365
    :goto_2b
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 2366
    .line 2367
    .line 2368
    move-result v4

    .line 2369
    if-eqz v4, :cond_57

    .line 2370
    .line 2371
    const/4 v5, 0x0

    .line 2372
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v4

    .line 2376
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 2377
    .line 2378
    .line 2379
    goto :goto_2b

    .line 2380
    :catchall_7
    move-exception v0

    .line 2381
    goto :goto_2d

    .line 2382
    :cond_57
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 2383
    .line 2384
    .line 2385
    invoke-virtual {v3}, Ldefpackage/w24;->j()V

    .line 2386
    .line 2387
    .line 2388
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2389
    .line 2390
    .line 2391
    move-result v1

    .line 2392
    const/4 v8, 0x0

    .line 2393
    :goto_2c
    if-ge v8, v1, :cond_58

    .line 2394
    .line 2395
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v3

    .line 2399
    add-int/lit8 v8, v8, 0x1

    .line 2400
    .line 2401
    check-cast v3, Ljava/lang/String;

    .line 2402
    .line 2403
    invoke-static {v0, v3}, Ldefpackage/wr1;->h(Ldefpackage/sc5;Ljava/lang/String;)V

    .line 2404
    .line 2405
    .line 2406
    goto :goto_2c

    .line 2407
    :cond_58
    return-void

    .line 2408
    :goto_2d
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 2409
    .line 2410
    .line 2411
    invoke-virtual {v3}, Ldefpackage/w24;->j()V

    .line 2412
    .line 2413
    .line 2414
    throw v0

    .line 2415
    :pswitch_19
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2416
    .line 2417
    check-cast v1, Lcom/eddyizm/tempus/service/MediaService;

    .line 2418
    .line 2419
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2420
    .line 2421
    check-cast v2, Ljava/util/List;

    .line 2422
    .line 2423
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2424
    .line 2425
    check-cast v0, Ldefpackage/qi3;

    .line 2426
    .line 2427
    iget-boolean v1, v1, Lcom/eddyizm/tempus/service/MediaService;->D:Z

    .line 2428
    .line 2429
    if-eqz v1, :cond_59

    .line 2430
    .line 2431
    goto :goto_2f

    .line 2432
    :cond_59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v1

    .line 2436
    :cond_5a
    :goto_2e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2437
    .line 2438
    .line 2439
    move-result v2

    .line 2440
    if-eqz v2, :cond_5b

    .line 2441
    .line 2442
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v2

    .line 2446
    check-cast v2, Ldefpackage/kd3;

    .line 2447
    .line 2448
    iget-object v3, v2, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 2449
    .line 2450
    check-cast v3, Ljava/lang/Number;

    .line 2451
    .line 2452
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2453
    .line 2454
    .line 2455
    move-result v3

    .line 2456
    iget-object v2, v2, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 2457
    .line 2458
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2459
    .line 2460
    .line 2461
    check-cast v2, Ldefpackage/gn2;

    .line 2462
    .line 2463
    invoke-interface {v0}, Ldefpackage/qi3;->o0()I

    .line 2464
    .line 2465
    .line 2466
    move-result v4

    .line 2467
    if-le v3, v4, :cond_5a

    .line 2468
    .line 2469
    invoke-interface {v0}, Ldefpackage/qi3;->Q0()I

    .line 2470
    .line 2471
    .line 2472
    move-result v4

    .line 2473
    if-ge v3, v4, :cond_5a

    .line 2474
    .line 2475
    invoke-interface {v0, v3}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v4

    .line 2479
    iget-object v4, v4, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 2480
    .line 2481
    iget-object v5, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 2482
    .line 2483
    invoke-static {v4, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2484
    .line 2485
    .line 2486
    move-result v4

    .line 2487
    if-eqz v4, :cond_5a

    .line 2488
    .line 2489
    invoke-interface {v0, v3, v2}, Ldefpackage/qi3;->z0(ILdefpackage/gn2;)V

    .line 2490
    .line 2491
    .line 2492
    goto :goto_2e

    .line 2493
    :cond_5b
    :goto_2f
    return-void

    .line 2494
    :pswitch_1a
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2495
    .line 2496
    check-cast v1, Landroid/media/AudioTrack;

    .line 2497
    .line 2498
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2499
    .line 2500
    check-cast v2, Landroid/os/Handler;

    .line 2501
    .line 2502
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2503
    .line 2504
    move-object v3, v0

    .line 2505
    check-cast v3, Ldefpackage/tc2;

    .line 2506
    .line 2507
    const/16 v4, 0x9

    .line 2508
    .line 2509
    :try_start_b
    invoke-virtual {v1}, Landroid/media/AudioTrack;->flush()V

    .line 2510
    .line 2511
    .line 2512
    invoke-virtual {v1}, Landroid/media/AudioTrack;->release()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v0

    .line 2519
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v0

    .line 2523
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 2524
    .line 2525
    .line 2526
    move-result v0

    .line 2527
    if-eqz v0, :cond_5c

    .line 2528
    .line 2529
    new-instance v0, Ldefpackage/a0;

    .line 2530
    .line 2531
    invoke-direct {v0, v4, v3}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 2532
    .line 2533
    .line 2534
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2535
    .line 2536
    .line 2537
    :cond_5c
    sget-object v1, Ldefpackage/an;->r:Ljava/lang/Object;

    .line 2538
    .line 2539
    monitor-enter v1

    .line 2540
    :try_start_c
    sget v0, Ldefpackage/an;->t:I

    .line 2541
    .line 2542
    const/16 v17, 0x1

    .line 2543
    .line 2544
    add-int/lit8 v0, v0, -0x1

    .line 2545
    .line 2546
    sput v0, Ldefpackage/an;->t:I

    .line 2547
    .line 2548
    if-nez v0, :cond_5d

    .line 2549
    .line 2550
    sget-object v0, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2551
    .line 2552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2553
    .line 2554
    .line 2555
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2556
    .line 2557
    .line 2558
    const/16 v16, 0x0

    .line 2559
    .line 2560
    sput-object v16, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2561
    .line 2562
    goto :goto_30

    .line 2563
    :catchall_8
    move-exception v0

    .line 2564
    goto :goto_31

    .line 2565
    :cond_5d
    :goto_30
    monitor-exit v1

    .line 2566
    return-void

    .line 2567
    :goto_31
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 2568
    throw v0

    .line 2569
    :catchall_9
    move-exception v0

    .line 2570
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v1

    .line 2574
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v1

    .line 2578
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 2579
    .line 2580
    .line 2581
    move-result v1

    .line 2582
    if-eqz v1, :cond_5e

    .line 2583
    .line 2584
    new-instance v1, Ldefpackage/a0;

    .line 2585
    .line 2586
    invoke-direct {v1, v4, v3}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 2587
    .line 2588
    .line 2589
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2590
    .line 2591
    .line 2592
    :cond_5e
    sget-object v1, Ldefpackage/an;->r:Ljava/lang/Object;

    .line 2593
    .line 2594
    monitor-enter v1

    .line 2595
    :try_start_d
    sget v2, Ldefpackage/an;->t:I

    .line 2596
    .line 2597
    const/16 v17, 0x1

    .line 2598
    .line 2599
    add-int/lit8 v2, v2, -0x1

    .line 2600
    .line 2601
    sput v2, Ldefpackage/an;->t:I

    .line 2602
    .line 2603
    if-nez v2, :cond_5f

    .line 2604
    .line 2605
    sget-object v2, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2606
    .line 2607
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2608
    .line 2609
    .line 2610
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2611
    .line 2612
    .line 2613
    const/16 v16, 0x0

    .line 2614
    .line 2615
    sput-object v16, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2616
    .line 2617
    goto :goto_32

    .line 2618
    :catchall_a
    move-exception v0

    .line 2619
    goto :goto_33

    .line 2620
    :cond_5f
    :goto_32
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 2621
    throw v0

    .line 2622
    :goto_33
    :try_start_e
    monitor-exit v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 2623
    throw v0

    .line 2624
    :pswitch_1b
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2625
    .line 2626
    check-cast v1, Ldefpackage/xc5;

    .line 2627
    .line 2628
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2629
    .line 2630
    check-cast v2, Ldefpackage/tb1;

    .line 2631
    .line 2632
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2633
    .line 2634
    check-cast v0, Ldefpackage/ej0;

    .line 2635
    .line 2636
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 2637
    .line 2638
    check-cast v1, Ldefpackage/qm;

    .line 2639
    .line 2640
    sget-object v3, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 2641
    .line 2642
    invoke-interface {v1, v2, v0}, Ldefpackage/qm;->y(Ldefpackage/tb1;Ldefpackage/ej0;)V

    .line 2643
    .line 2644
    .line 2645
    return-void

    .line 2646
    :pswitch_1c
    iget-object v1, v0, Ldefpackage/v6;->o:Ljava/lang/Object;

    .line 2647
    .line 2648
    check-cast v1, Ljava/util/ArrayList;

    .line 2649
    .line 2650
    iget-object v2, v0, Ldefpackage/v6;->p:Ljava/lang/Object;

    .line 2651
    .line 2652
    check-cast v2, Ldefpackage/ss0;

    .line 2653
    .line 2654
    iget-object v2, v2, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 2655
    .line 2656
    check-cast v2, Ldefpackage/s24;

    .line 2657
    .line 2658
    iget-object v0, v0, Ldefpackage/v6;->q:Ljava/lang/Object;

    .line 2659
    .line 2660
    check-cast v0, [I

    .line 2661
    .line 2662
    const-string v3, "AlbumArtistBackfill"

    .line 2663
    .line 2664
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2665
    .line 2666
    .line 2667
    move-result v4

    .line 2668
    const/4 v5, 0x0

    .line 2669
    :goto_34
    if-ge v5, v4, :cond_62

    .line 2670
    .line 2671
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v6

    .line 2675
    add-int/lit8 v5, v5, 0x1

    .line 2676
    .line 2677
    check-cast v6, Ldefpackage/w6;

    .line 2678
    .line 2679
    iget-object v7, v6, Ldefpackage/w6;->a:Ljava/lang/String;

    .line 2680
    .line 2681
    iget-object v8, v6, Ldefpackage/w6;->b:Ljava/lang/String;

    .line 2682
    .line 2683
    new-instance v9, Ldefpackage/ps0;

    .line 2684
    .line 2685
    const/4 v10, 0x0

    .line 2686
    invoke-direct {v9, v10, v7, v8}, Ldefpackage/ps0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 2687
    .line 2688
    .line 2689
    const/4 v11, 0x1

    .line 2690
    invoke-static {v2, v11, v10, v9}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v9

    .line 2694
    check-cast v9, Ljava/lang/Integer;

    .line 2695
    .line 2696
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 2697
    .line 2698
    .line 2699
    move-result v9

    .line 2700
    if-lez v9, :cond_60

    .line 2701
    .line 2702
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2703
    .line 2704
    const-string v10, "Left album "

    .line 2705
    .line 2706
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2707
    .line 2708
    .line 2709
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2710
    .line 2711
    .line 2712
    const-string v7, " alone, "

    .line 2713
    .line 2714
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2715
    .line 2716
    .line 2717
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2718
    .line 2719
    .line 2720
    const-string v7, " unfilled rows under it are not filed as "

    .line 2721
    .line 2722
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2723
    .line 2724
    .line 2725
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2726
    .line 2727
    .line 2728
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v6

    .line 2732
    invoke-static {v3, v6}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2733
    .line 2734
    .line 2735
    goto :goto_34

    .line 2736
    :cond_60
    iget-object v6, v6, Ldefpackage/w6;->c:Ljava/lang/String;

    .line 2737
    .line 2738
    new-instance v9, Ldefpackage/qs0;

    .line 2739
    .line 2740
    const/4 v10, 0x0

    .line 2741
    invoke-direct {v9, v6, v7, v8, v10}, Ldefpackage/qs0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 2742
    .line 2743
    .line 2744
    const/4 v11, 0x1

    .line 2745
    invoke-static {v2, v10, v11, v9}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v6

    .line 2749
    check-cast v6, Ljava/lang/Integer;

    .line 2750
    .line 2751
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 2752
    .line 2753
    .line 2754
    move-result v6

    .line 2755
    if-lez v6, :cond_61

    .line 2756
    .line 2757
    aget v6, v0, v10

    .line 2758
    .line 2759
    add-int/2addr v6, v11

    .line 2760
    aput v6, v0, v10

    .line 2761
    .line 2762
    goto :goto_34

    .line 2763
    :cond_61
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2764
    .line 2765
    const-string v9, "Album "

    .line 2766
    .line 2767
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2768
    .line 2769
    .line 2770
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2771
    .line 2772
    .line 2773
    const-string v7, " changed no row as "

    .line 2774
    .line 2775
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2776
    .line 2777
    .line 2778
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2779
    .line 2780
    .line 2781
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2782
    .line 2783
    .line 2784
    move-result-object v6

    .line 2785
    invoke-static {v3, v6}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2786
    .line 2787
    .line 2788
    goto :goto_34

    .line 2789
    :cond_62
    return-void

    .line 2790
    nop

    .line 2791
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
