.class public final synthetic Loq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/AbstractList;

.field public final synthetic c:Ljava/io/Serializable;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Loq0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Loq0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Loq0;->b:Ljava/util/AbstractList;

    .line 6
    .line 7
    iput-object p3, p0, Loq0;->c:Ljava/io/Serializable;

    .line 8
    .line 9
    iput-object p4, p0, Loq0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Loq0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loq0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lgl3;

    .line 9
    .line 10
    iget-object v1, p0, Loq0;->b:Ljava/util/AbstractList;

    .line 11
    .line 12
    iget-object v2, p0, Loq0;->c:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, Loq0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/app/Dialog;

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v3, Lnz2;

    .line 28
    .line 29
    const/16 v4, 0xe

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lnz2;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3, p1}, Lhw;->P(Leg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object p1, v0, Lgl3;->c:Lmm3;

    .line 42
    .line 43
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lgl3;->d:Lk03;

    .line 49
    .line 50
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v3, v0}, Lmm3;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, Loq0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v2, v0

    .line 66
    check-cast v2, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 67
    .line 68
    iget-object v0, p0, Loq0;->b:Ljava/util/AbstractList;

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    check-cast v3, Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v0, p0, Loq0;->c:Ljava/io/Serializable;

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    check-cast v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    .line 78
    iget-object p0, p0, Loq0;->e:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v5, p0

    .line 81
    check-cast v5, Ltx1;

    .line 82
    .line 83
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 124
    .line 125
    .line 126
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->q0:Lom0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lom0;->W(Ljava/lang/String;)Lk03;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v1, Loq0;

    .line 140
    .line 141
    const/4 v6, 0x1

    .line 142
    invoke-direct/range {v1 .. v6}, Loq0;-><init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_1

    .line 154
    .line 155
    monitor-enter v3

    .line 156
    :try_start_0
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    monitor-exit v3

    .line 160
    goto :goto_0

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object p0, v0

    .line 163
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    throw p0

    .line 165
    :cond_3
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-nez p0, :cond_4

    .line 170
    .line 171
    invoke-virtual {v5}, Ltx1;->run()V

    .line 172
    .line 173
    .line 174
    :cond_4
    return-void

    .line 175
    :pswitch_1
    iget-object v0, p0, Loq0;->d:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v2, v0

    .line 178
    check-cast v2, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 179
    .line 180
    iget-object v0, p0, Loq0;->b:Ljava/util/AbstractList;

    .line 181
    .line 182
    move-object v3, v0

    .line 183
    check-cast v3, Ljava/util/ArrayList;

    .line 184
    .line 185
    iget-object v0, p0, Loq0;->c:Ljava/io/Serializable;

    .line 186
    .line 187
    move-object v4, v0

    .line 188
    check-cast v4, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 189
    .line 190
    iget-object p0, p0, Loq0;->e:Ljava/lang/Object;

    .line 191
    .line 192
    move-object v5, p0

    .line 193
    check-cast v5, Lmq0;

    .line 194
    .line 195
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 196
    .line 197
    if-eqz p1, :cond_7

    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    if-eqz p0, :cond_7

    .line 204
    .line 205
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    :cond_5
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_7

    .line 218
    .line 219
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 236
    .line 237
    .line 238
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->q0:Lom0;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {p1}, Lom0;->W(Ljava/lang/String;)Lk03;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v1, Loq0;

    .line 252
    .line 253
    const/4 v6, 0x0

    .line 254
    invoke-direct/range {v1 .. v6}, Loq0;-><init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_6
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-nez v0, :cond_5

    .line 266
    .line 267
    monitor-enter v3

    .line 268
    :try_start_1
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    monitor-exit v3

    .line 272
    goto :goto_1

    .line 273
    :catchall_1
    move-exception v0

    .line 274
    move-object p0, v0

    .line 275
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    throw p0

    .line 277
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    if-nez p0, :cond_8

    .line 282
    .line 283
    invoke-virtual {v5}, Lmq0;->run()V

    .line 284
    .line 285
    .line 286
    :cond_8
    return-void

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
