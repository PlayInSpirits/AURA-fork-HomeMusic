.class public final synthetic Ldefpackage/fm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 18
    iput p6, p0, Ldefpackage/fm2;->n:I

    iput-object p1, p0, Ldefpackage/fm2;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/fm2;->q:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/fm2;->r:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/fm2;->s:Ljava/lang/Object;

    iput p5, p0, Ldefpackage/fm2;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/ls2;Ldefpackage/va4;ILdefpackage/ms2;Ldefpackage/ks2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/fm2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/fm2;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/fm2;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Ldefpackage/fm2;->o:I

    .line 12
    .line 13
    iput-object p4, p0, Ldefpackage/fm2;->r:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ldefpackage/fm2;->s:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/fm2;->n:I

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/fm2;->o:I

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/fm2;->s:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/fm2;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Ldefpackage/fm2;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Ldefpackage/fm2;->p:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Ldefpackage/zt2;

    .line 17
    .line 18
    check-cast v4, Landroid/util/Pair;

    .line 19
    .line 20
    move-object v9, v3

    .line 21
    check-cast v9, Ldefpackage/ed2;

    .line 22
    .line 23
    move-object v10, v2

    .line 24
    check-cast v10, Ldefpackage/un2;

    .line 25
    .line 26
    iget-object v0, v5, Ldefpackage/zt2;->o:Ldefpackage/fo1;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v0

    .line 31
    check-cast v6, Ldefpackage/nj0;

    .line 32
    .line 33
    iget-object v0, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    iget-object v0, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v8, v0

    .line 44
    check-cast v8, Ldefpackage/mt2;

    .line 45
    .line 46
    iget v11, p0, Ldefpackage/fm2;->o:I

    .line 47
    .line 48
    invoke-virtual/range {v6 .. v11}, Ldefpackage/nj0;->U(ILdefpackage/mt2;Ldefpackage/ed2;Ldefpackage/un2;I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    check-cast v5, Ldefpackage/ls2;

    .line 53
    .line 54
    check-cast v4, Ldefpackage/va4;

    .line 55
    .line 56
    check-cast v3, Ldefpackage/ms2;

    .line 57
    .line 58
    check-cast v2, Ldefpackage/ks2;

    .line 59
    .line 60
    iget-object p0, v5, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 61
    .line 62
    invoke-virtual {p0}, Ldefpackage/tn2;->l()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    iget-object p0, v5, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ldefpackage/kr2;

    .line 74
    .line 75
    iget-object p0, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/media/session/MediaSession;->isActive()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    const-string v6, "MediaSessionLegacyStub"

    .line 82
    .line 83
    if-nez p0, :cond_2

    .line 84
    .line 85
    new-instance p0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v0, "Ignore incoming session command before initialization. command="

    .line 88
    .line 89
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    if-nez v4, :cond_1

    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    iget-object v0, v4, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ", pid="

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v0, v3, Ldefpackage/ms2;->a:Ldefpackage/os2;

    .line 110
    .line 111
    iget v0, v0, Ldefpackage/os2;->b:I

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {v6, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v5, v3}, Ldefpackage/ls2;->M(Ldefpackage/ms2;)Ldefpackage/fr2;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    iget-object v0, v5, Ldefpackage/ls2;->f:Ldefpackage/na4;

    .line 129
    .line 130
    if-eqz v4, :cond_3

    .line 131
    .line 132
    invoke-virtual {v0, p0, v4}, Ldefpackage/na4;->J(Ldefpackage/fr2;Ldefpackage/va4;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    invoke-virtual {v0, p0, v1}, Ldefpackage/na4;->I(Ldefpackage/fr2;I)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_4

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_4
    :try_start_0
    invoke-interface {v2, p0}, Ldefpackage/ks2;->b(Ldefpackage/fr2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catch_0
    move-exception v0

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    const-string v2, "Exception in "

    .line 154
    .line 155
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {v6, p0, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    :goto_1
    return-void

    .line 169
    :pswitch_1
    check-cast v5, Ldefpackage/im2;

    .line 170
    .line 171
    check-cast v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 172
    .line 173
    check-cast v3, Ljava/util/List;

    .line 174
    .line 175
    check-cast v2, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-ne p0, v0, :cond_6

    .line 186
    .line 187
    const/4 p0, 0x0

    .line 188
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-ge p0, v0, :cond_6

    .line 193
    .line 194
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Ldefpackage/ic2;

    .line 199
    .line 200
    if-eqz v0, :cond_5

    .line 201
    .line 202
    :try_start_1
    invoke-static {v0}, Ldefpackage/hw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :catch_1
    move-exception v0

    .line 210
    goto :goto_3

    .line 211
    :catch_2
    move-exception v0

    .line 212
    :goto_3
    const-string v4, "MCImplLegacy"

    .line 213
    .line 214
    const-string v6, "Failed to get bitmap"

    .line 215
    .line 216
    invoke-static {v4, v6, v0}, Ldefpackage/l93;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 217
    .line 218
    .line 219
    :cond_5
    const/4 v0, 0x0

    .line 220
    :goto_4
    iget-object v4, v5, Ldefpackage/im2;->i:Ldefpackage/wo0;

    .line 221
    .line 222
    invoke-interface {v3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    check-cast v6, Ldefpackage/gn2;

    .line 227
    .line 228
    invoke-static {v6, v0}, Ldefpackage/f92;->i(Ldefpackage/gn2;Landroid/graphics/Bitmap;)Ldefpackage/pm2;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    add-int v6, v1, p0

    .line 233
    .line 234
    invoke-virtual {v4, v0, v6}, Ldefpackage/wo0;->a(Ldefpackage/pm2;I)V

    .line 235
    .line 236
    .line 237
    add-int/lit8 p0, p0, 0x1

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_6
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
