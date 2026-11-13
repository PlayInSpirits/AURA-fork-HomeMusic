.class public final Ldefpackage/dm0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/lt2;


# instance fields
.field public final a:Ldefpackage/au;

.field public final b:Ldefpackage/bi0;

.field public c:Ldefpackage/om0;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:F

.field public final h:F

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldefpackage/sk0;)V
    .locals 1

    .line 64
    new-instance v0, Ldefpackage/rf2;

    invoke-direct {v0, p1}, Ldefpackage/rf2;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Ldefpackage/dm0;-><init>(Ldefpackage/bi0;Ldefpackage/n51;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/bi0;Ldefpackage/n51;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/dm0;->b:Ldefpackage/bi0;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/om0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Ldefpackage/om0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 13
    .line 14
    new-instance v2, Ldefpackage/au;

    .line 15
    .line 16
    invoke-direct {v2, p2, v0}, Ldefpackage/au;-><init>(Ldefpackage/n51;Ldefpackage/om0;)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 20
    .line 21
    iget-object p2, v2, Ldefpackage/au;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Ldefpackage/bi0;

    .line 24
    .line 25
    if-eq p1, p2, :cond_0

    .line 26
    .line 27
    iput-object p1, v2, Ldefpackage/au;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p1, v2, Ldefpackage/au;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object p1, v2, Ldefpackage/au;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 41
    .line 42
    .line 43
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide p1, p0, Ldefpackage/dm0;->d:J

    .line 49
    .line 50
    iput-wide p1, p0, Ldefpackage/dm0;->e:J

    .line 51
    .line 52
    iput-wide p1, p0, Ldefpackage/dm0;->f:J

    .line 53
    .line 54
    const p1, -0x800001

    .line 55
    .line 56
    .line 57
    iput p1, p0, Ldefpackage/dm0;->g:F

    .line 58
    .line 59
    iput p1, p0, Ldefpackage/dm0;->h:F

    .line 60
    .line 61
    iput-boolean v1, p0, Ldefpackage/dm0;->i:Z

    .line 62
    .line 63
    return-void
.end method

.method public static f(Ljava/lang/Class;Ldefpackage/bi0;)Ldefpackage/lt2;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Ldefpackage/bi0;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/lt2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method


# virtual methods
.method public final a(Ldefpackage/om0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/au;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/n51;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ldefpackage/n51;->a(Ldefpackage/om0;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/au;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ldefpackage/lt2;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ldefpackage/lt2;->a(Ldefpackage/om0;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/n51;

    .line 9
    .line 10
    invoke-interface {p0}, Ldefpackage/n51;->b()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Ldefpackage/dm0;->i:Z

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 4
    .line 5
    iput-boolean p1, p0, Ldefpackage/au;->a:Z

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/n51;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ldefpackage/n51;->d(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/au;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ldefpackage/lt2;

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ldefpackage/lt2;->c(Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public final d(Ldefpackage/gn2;)Ldefpackage/bq;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 11
    .line 12
    iget-object v2, v2, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const-string v4, "ssai"

    .line 22
    .line 23
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    throw v3

    .line 31
    :cond_1
    :goto_0
    iget-object v2, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 32
    .line 33
    iget-object v2, v2, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "application/x-image-uri"

    .line 36
    .line 37
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v4, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 42
    .line 43
    if-nez v2, :cond_18

    .line 44
    .line 45
    iget-object v2, v4, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 46
    .line 47
    iget-object v4, v4, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v4}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v4, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 54
    .line 55
    iget-wide v4, v4, Ldefpackage/bn2;->h:J

    .line 56
    .line 57
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    iget-object v4, v0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 68
    .line 69
    iget-object v4, v4, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ldefpackage/n51;

    .line 72
    .line 73
    instance-of v8, v4, Ldefpackage/sk0;

    .line 74
    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    check-cast v4, Ldefpackage/sk0;

    .line 78
    .line 79
    monitor-enter v4

    .line 80
    :try_start_0
    iput v5, v4, Ldefpackage/sk0;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    monitor-exit v4

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    throw v0

    .line 87
    :cond_2
    :goto_1
    iget-object v4, v0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 88
    .line 89
    iget-object v4, v4, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ldefpackage/n51;

    .line 92
    .line 93
    instance-of v8, v4, Ldefpackage/sk0;

    .line 94
    .line 95
    if-eqz v8, :cond_3

    .line 96
    .line 97
    check-cast v4, Ldefpackage/sk0;

    .line 98
    .line 99
    monitor-enter v4

    .line 100
    :try_start_2
    iput v5, v4, Ldefpackage/sk0;->g:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    monitor-exit v4

    .line 103
    goto :goto_2

    .line 104
    :catchall_1
    move-exception v0

    .line 105
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 106
    throw v0

    .line 107
    :cond_3
    :goto_2
    :try_start_4
    iget-object v4, v0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 108
    .line 109
    invoke-virtual {v4, v2}, Ldefpackage/au;->c(I)Ldefpackage/lt2;

    .line 110
    .line 111
    .line 112
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    .line 113
    iget-object v4, v1, Ldefpackage/gn2;->c:Ldefpackage/an2;

    .line 114
    .line 115
    invoke-virtual {v4}, Ldefpackage/an2;->a()Ldefpackage/zm2;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iget-object v8, v1, Ldefpackage/gn2;->c:Ldefpackage/an2;

    .line 120
    .line 121
    iget-wide v9, v8, Ldefpackage/an2;->a:J

    .line 122
    .line 123
    cmp-long v9, v9, v6

    .line 124
    .line 125
    if-nez v9, :cond_4

    .line 126
    .line 127
    iget-wide v9, v0, Ldefpackage/dm0;->d:J

    .line 128
    .line 129
    iput-wide v9, v4, Ldefpackage/zm2;->a:J

    .line 130
    .line 131
    :cond_4
    iget v9, v8, Ldefpackage/an2;->d:F

    .line 132
    .line 133
    const v10, -0x800001

    .line 134
    .line 135
    .line 136
    cmpl-float v9, v9, v10

    .line 137
    .line 138
    if-nez v9, :cond_5

    .line 139
    .line 140
    iget v9, v0, Ldefpackage/dm0;->g:F

    .line 141
    .line 142
    iput v9, v4, Ldefpackage/zm2;->d:F

    .line 143
    .line 144
    :cond_5
    iget v9, v8, Ldefpackage/an2;->e:F

    .line 145
    .line 146
    cmpl-float v9, v9, v10

    .line 147
    .line 148
    if-nez v9, :cond_6

    .line 149
    .line 150
    iget v9, v0, Ldefpackage/dm0;->h:F

    .line 151
    .line 152
    iput v9, v4, Ldefpackage/zm2;->e:F

    .line 153
    .line 154
    :cond_6
    iget-wide v9, v8, Ldefpackage/an2;->b:J

    .line 155
    .line 156
    cmp-long v9, v9, v6

    .line 157
    .line 158
    if-nez v9, :cond_7

    .line 159
    .line 160
    iget-wide v9, v0, Ldefpackage/dm0;->e:J

    .line 161
    .line 162
    iput-wide v9, v4, Ldefpackage/zm2;->b:J

    .line 163
    .line 164
    :cond_7
    iget-wide v8, v8, Ldefpackage/an2;->c:J

    .line 165
    .line 166
    cmp-long v6, v8, v6

    .line 167
    .line 168
    if-nez v6, :cond_8

    .line 169
    .line 170
    iget-wide v6, v0, Ldefpackage/dm0;->f:J

    .line 171
    .line 172
    iput-wide v6, v4, Ldefpackage/zm2;->c:J

    .line 173
    .line 174
    :cond_8
    new-instance v6, Ldefpackage/an2;

    .line 175
    .line 176
    invoke-direct {v6, v4}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 177
    .line 178
    .line 179
    iget-object v4, v1, Ldefpackage/gn2;->c:Ldefpackage/an2;

    .line 180
    .line 181
    invoke-virtual {v6, v4}, Ldefpackage/an2;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_9

    .line 186
    .line 187
    invoke-virtual {v1}, Ldefpackage/gn2;->a()Ldefpackage/tm2;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v6}, Ldefpackage/an2;->a()Ldefpackage/zm2;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    iput-object v4, v1, Ldefpackage/tm2;->l:Ldefpackage/zm2;

    .line 196
    .line 197
    invoke-virtual {v1}, Ldefpackage/tm2;->a()Ldefpackage/gn2;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :cond_9
    invoke-interface {v2, v1}, Ldefpackage/lt2;->d(Ldefpackage/gn2;)Ldefpackage/bq;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v4, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 206
    .line 207
    iget-object v4, v4, Ldefpackage/bn2;->g:Ldefpackage/yw1;

    .line 208
    .line 209
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    const/4 v7, 0x0

    .line 214
    if-nez v6, :cond_14

    .line 215
    .line 216
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    add-int/2addr v6, v5

    .line 221
    new-array v6, v6, [Ldefpackage/bq;

    .line 222
    .line 223
    aput-object v2, v6, v7

    .line 224
    .line 225
    move v2, v7

    .line 226
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-ge v2, v8, :cond_13

    .line 231
    .line 232
    iget-boolean v8, v0, Ldefpackage/dm0;->i:Z

    .line 233
    .line 234
    const/16 v9, 0x1c

    .line 235
    .line 236
    if-eqz v8, :cond_12

    .line 237
    .line 238
    new-instance v8, Ldefpackage/sb1;

    .line 239
    .line 240
    invoke-direct {v8}, Ldefpackage/sb1;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    check-cast v10, Ldefpackage/fn2;

    .line 248
    .line 249
    iget-object v10, v10, Ldefpackage/fn2;->b:Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {v10}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    iput-object v10, v8, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 256
    .line 257
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    check-cast v10, Ldefpackage/fn2;

    .line 262
    .line 263
    iget-object v10, v10, Ldefpackage/fn2;->c:Ljava/lang/String;

    .line 264
    .line 265
    iput-object v10, v8, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 266
    .line 267
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    check-cast v10, Ldefpackage/fn2;

    .line 272
    .line 273
    iget v10, v10, Ldefpackage/fn2;->d:I

    .line 274
    .line 275
    iput v10, v8, Ldefpackage/sb1;->e:I

    .line 276
    .line 277
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    check-cast v10, Ldefpackage/fn2;

    .line 282
    .line 283
    iget v10, v10, Ldefpackage/fn2;->e:I

    .line 284
    .line 285
    iput v10, v8, Ldefpackage/sb1;->f:I

    .line 286
    .line 287
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    check-cast v10, Ldefpackage/fn2;

    .line 292
    .line 293
    iget-object v10, v10, Ldefpackage/fn2;->f:Ljava/lang/String;

    .line 294
    .line 295
    iput-object v10, v8, Ldefpackage/sb1;->b:Ljava/lang/String;

    .line 296
    .line 297
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    check-cast v10, Ldefpackage/fn2;

    .line 302
    .line 303
    iget-object v10, v10, Ldefpackage/fn2;->g:Ljava/lang/String;

    .line 304
    .line 305
    iput-object v10, v8, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 306
    .line 307
    new-instance v10, Ldefpackage/tb1;

    .line 308
    .line 309
    invoke-direct {v10, v8}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 310
    .line 311
    .line 312
    new-instance v8, Ldefpackage/zl0;

    .line 313
    .line 314
    invoke-direct {v8, v0, v10}, Ldefpackage/zl0;-><init>(Ldefpackage/dm0;Ldefpackage/tb1;)V

    .line 315
    .line 316
    .line 317
    iget-object v13, v0, Ldefpackage/dm0;->b:Ldefpackage/bi0;

    .line 318
    .line 319
    new-instance v14, Ldefpackage/ss2;

    .line 320
    .line 321
    const/16 v11, 0xa

    .line 322
    .line 323
    invoke-direct {v14, v11, v8}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    new-instance v8, Ljava/lang/Object;

    .line 327
    .line 328
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 329
    .line 330
    .line 331
    new-instance v11, Ldefpackage/i80;

    .line 332
    .line 333
    invoke-direct {v11, v9}, Ldefpackage/i80;-><init>(I)V

    .line 334
    .line 335
    .line 336
    iget-object v9, v0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 337
    .line 338
    invoke-virtual {v9, v10}, Ldefpackage/om0;->n(Ldefpackage/tb1;)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-eqz v9, :cond_a

    .line 343
    .line 344
    invoke-virtual {v10}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    const-string v12, "application/x-media3-cues"

    .line 349
    .line 350
    invoke-static {v12}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    iput-object v12, v9, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 355
    .line 356
    iget-object v12, v10, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 357
    .line 358
    iput-object v12, v9, Ldefpackage/sb1;->j:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v12, v0, Ldefpackage/dm0;->c:Ldefpackage/om0;

    .line 361
    .line 362
    invoke-virtual {v12, v10}, Ldefpackage/om0;->R(Ldefpackage/tb1;)I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    iput v10, v9, Ldefpackage/sb1;->K:I

    .line 367
    .line 368
    new-instance v10, Ldefpackage/tb1;

    .line 369
    .line 370
    invoke-direct {v10, v9}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 371
    .line 372
    .line 373
    :cond_a
    move-object/from16 v18, v10

    .line 374
    .line 375
    add-int/lit8 v9, v2, 0x1

    .line 376
    .line 377
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    check-cast v10, Ldefpackage/fn2;

    .line 382
    .line 383
    iget-object v10, v10, Ldefpackage/fn2;->a:Landroid/net/Uri;

    .line 384
    .line 385
    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    new-instance v12, Ldefpackage/um2;

    .line 390
    .line 391
    invoke-direct {v12}, Ldefpackage/um2;-><init>()V

    .line 392
    .line 393
    .line 394
    new-instance v15, Ldefpackage/xm2;

    .line 395
    .line 396
    invoke-direct {v15}, Ldefpackage/xm2;-><init>()V

    .line 397
    .line 398
    .line 399
    sget-object v24, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 400
    .line 401
    sget-object v26, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 402
    .line 403
    new-instance v7, Ldefpackage/zm2;

    .line 404
    .line 405
    invoke-direct {v7}, Ldefpackage/zm2;-><init>()V

    .line 406
    .line 407
    .line 408
    sget-object v33, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 409
    .line 410
    if-nez v10, :cond_b

    .line 411
    .line 412
    move-object/from16 v20, v3

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_b
    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    move-object/from16 v20, v10

    .line 420
    .line 421
    :goto_4
    iget-object v10, v15, Ldefpackage/xm2;->e:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v10, Landroid/net/Uri;

    .line 424
    .line 425
    if-eqz v10, :cond_d

    .line 426
    .line 427
    iget-object v10, v15, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v10, Ljava/util/UUID;

    .line 430
    .line 431
    if-eqz v10, :cond_c

    .line 432
    .line 433
    goto :goto_5

    .line 434
    :cond_c
    const/4 v10, 0x0

    .line 435
    goto :goto_6

    .line 436
    :cond_d
    :goto_5
    move v10, v5

    .line 437
    :goto_6
    invoke-static {v10}, Ldefpackage/rr2;->w(Z)V

    .line 438
    .line 439
    .line 440
    if-eqz v20, :cond_f

    .line 441
    .line 442
    new-instance v19, Ldefpackage/bn2;

    .line 443
    .line 444
    iget-object v10, v15, Ldefpackage/xm2;->d:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v10, Ljava/util/UUID;

    .line 447
    .line 448
    if-eqz v10, :cond_e

    .line 449
    .line 450
    new-instance v10, Ldefpackage/ym2;

    .line 451
    .line 452
    invoke-direct {v10, v15}, Ldefpackage/ym2;-><init>(Ldefpackage/xm2;)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v22, v10

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_e
    move-object/from16 v22, v3

    .line 459
    .line 460
    :goto_7
    const/16 v21, 0x0

    .line 461
    .line 462
    const/16 v23, 0x0

    .line 463
    .line 464
    const/16 v25, 0x0

    .line 465
    .line 466
    const-wide v27, -0x7fffffffffffffffL    # -4.9E-324

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    invoke-direct/range {v19 .. v28}, Ldefpackage/bn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/ym2;Ldefpackage/sm2;Ljava/util/List;Ljava/lang/String;Ldefpackage/yw1;J)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v30, v19

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_f
    move-object/from16 v30, v3

    .line 478
    .line 479
    :goto_8
    new-instance v27, Ldefpackage/gn2;

    .line 480
    .line 481
    const-string v28, ""

    .line 482
    .line 483
    new-instance v10, Ldefpackage/wm2;

    .line 484
    .line 485
    invoke-direct {v10, v12}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 486
    .line 487
    .line 488
    new-instance v12, Ldefpackage/an2;

    .line 489
    .line 490
    invoke-direct {v12, v7}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 491
    .line 492
    .line 493
    sget-object v32, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 494
    .line 495
    move-object/from16 v29, v10

    .line 496
    .line 497
    move-object/from16 v31, v12

    .line 498
    .line 499
    invoke-direct/range {v27 .. v33}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 500
    .line 501
    .line 502
    move-object/from16 v12, v27

    .line 503
    .line 504
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-object/from16 v16, v11

    .line 508
    .line 509
    new-instance v11, Ldefpackage/kr3;

    .line 510
    .line 511
    iget-object v7, v12, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 512
    .line 513
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v7, v12, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 517
    .line 518
    iget-object v7, v7, Ldefpackage/bn2;->c:Ldefpackage/ym2;

    .line 519
    .line 520
    if-nez v7, :cond_10

    .line 521
    .line 522
    sget-object v7, Ldefpackage/ww0;->a:Ldefpackage/uw0;

    .line 523
    .line 524
    :goto_9
    move-object v15, v7

    .line 525
    goto :goto_b

    .line 526
    :cond_10
    monitor-enter v8

    .line 527
    :try_start_5
    invoke-virtual {v7, v3}, Ldefpackage/ym2;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v10

    .line 531
    if-nez v10, :cond_11

    .line 532
    .line 533
    invoke-static {v7}, Ldefpackage/yc5;->a(Ldefpackage/ym2;)Ldefpackage/kk0;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    goto :goto_a

    .line 538
    :catchall_2
    move-exception v0

    .line 539
    goto :goto_c

    .line 540
    :cond_11
    move-object v7, v3

    .line 541
    :goto_a
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 545
    goto :goto_9

    .line 546
    :goto_b
    const/high16 v17, 0x100000

    .line 547
    .line 548
    invoke-direct/range {v11 .. v18}, Ldefpackage/kr3;-><init>(Ldefpackage/gn2;Ldefpackage/bi0;Ldefpackage/ss2;Ldefpackage/ww0;Ldefpackage/i80;ILdefpackage/tb1;)V

    .line 549
    .line 550
    .line 551
    aput-object v11, v6, v9

    .line 552
    .line 553
    goto :goto_d

    .line 554
    :goto_c
    :try_start_6
    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 555
    throw v0

    .line 556
    :cond_12
    iget-object v7, v0, Ldefpackage/dm0;->b:Ldefpackage/bi0;

    .line 557
    .line 558
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    new-instance v8, Ldefpackage/i80;

    .line 562
    .line 563
    invoke-direct {v8, v9}, Ldefpackage/i80;-><init>(I)V

    .line 564
    .line 565
    .line 566
    add-int/lit8 v9, v2, 0x1

    .line 567
    .line 568
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    check-cast v10, Ldefpackage/fn2;

    .line 573
    .line 574
    new-instance v11, Ldefpackage/hf4;

    .line 575
    .line 576
    invoke-direct {v11, v10, v7, v8}, Ldefpackage/hf4;-><init>(Ldefpackage/fn2;Ldefpackage/bi0;Ldefpackage/i80;)V

    .line 577
    .line 578
    .line 579
    aput-object v11, v6, v9

    .line 580
    .line 581
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    goto/16 :goto_3

    .line 585
    .line 586
    :cond_13
    new-instance v2, Ldefpackage/ov2;

    .line 587
    .line 588
    invoke-direct {v2, v6}, Ldefpackage/ov2;-><init>([Ldefpackage/bq;)V

    .line 589
    .line 590
    .line 591
    :cond_14
    iget-object v0, v1, Ldefpackage/gn2;->e:Ldefpackage/wm2;

    .line 592
    .line 593
    iget-wide v3, v0, Ldefpackage/vm2;->b:J

    .line 594
    .line 595
    const-wide/16 v6, 0x0

    .line 596
    .line 597
    cmp-long v3, v3, v6

    .line 598
    .line 599
    if-nez v3, :cond_15

    .line 600
    .line 601
    iget-wide v3, v0, Ldefpackage/vm2;->d:J

    .line 602
    .line 603
    const-wide/high16 v8, -0x8000000000000000L

    .line 604
    .line 605
    cmp-long v3, v3, v8

    .line 606
    .line 607
    if-nez v3, :cond_15

    .line 608
    .line 609
    iget-boolean v3, v0, Ldefpackage/vm2;->f:Z

    .line 610
    .line 611
    if-nez v3, :cond_15

    .line 612
    .line 613
    goto :goto_f

    .line 614
    :cond_15
    new-instance v3, Ldefpackage/c40;

    .line 615
    .line 616
    invoke-direct {v3, v2}, Ldefpackage/c40;-><init>(Ldefpackage/bq;)V

    .line 617
    .line 618
    .line 619
    iget-wide v8, v0, Ldefpackage/vm2;->b:J

    .line 620
    .line 621
    cmp-long v2, v8, v6

    .line 622
    .line 623
    if-ltz v2, :cond_16

    .line 624
    .line 625
    move v7, v5

    .line 626
    goto :goto_e

    .line 627
    :cond_16
    const/4 v7, 0x0

    .line 628
    :goto_e
    invoke-static {v7}, Ldefpackage/rr2;->l(Z)V

    .line 629
    .line 630
    .line 631
    iget-boolean v2, v3, Ldefpackage/c40;->h:Z

    .line 632
    .line 633
    xor-int/2addr v2, v5

    .line 634
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 635
    .line 636
    .line 637
    iput-wide v8, v3, Ldefpackage/c40;->b:J

    .line 638
    .line 639
    iget-wide v6, v0, Ldefpackage/vm2;->d:J

    .line 640
    .line 641
    iget-boolean v2, v3, Ldefpackage/c40;->h:Z

    .line 642
    .line 643
    xor-int/2addr v2, v5

    .line 644
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 645
    .line 646
    .line 647
    iput-wide v6, v3, Ldefpackage/c40;->c:J

    .line 648
    .line 649
    iget-boolean v2, v0, Ldefpackage/vm2;->g:Z

    .line 650
    .line 651
    xor-int/2addr v2, v5

    .line 652
    iget-boolean v4, v3, Ldefpackage/c40;->h:Z

    .line 653
    .line 654
    xor-int/2addr v4, v5

    .line 655
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 656
    .line 657
    .line 658
    iput-boolean v2, v3, Ldefpackage/c40;->d:Z

    .line 659
    .line 660
    iget-boolean v2, v0, Ldefpackage/vm2;->e:Z

    .line 661
    .line 662
    iget-boolean v4, v3, Ldefpackage/c40;->h:Z

    .line 663
    .line 664
    xor-int/2addr v4, v5

    .line 665
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 666
    .line 667
    .line 668
    iput-boolean v2, v3, Ldefpackage/c40;->e:Z

    .line 669
    .line 670
    iget-boolean v2, v0, Ldefpackage/vm2;->f:Z

    .line 671
    .line 672
    iget-boolean v4, v3, Ldefpackage/c40;->h:Z

    .line 673
    .line 674
    xor-int/2addr v4, v5

    .line 675
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 676
    .line 677
    .line 678
    iput-boolean v2, v3, Ldefpackage/c40;->f:Z

    .line 679
    .line 680
    iget-boolean v0, v0, Ldefpackage/vm2;->h:Z

    .line 681
    .line 682
    iget-boolean v2, v3, Ldefpackage/c40;->h:Z

    .line 683
    .line 684
    xor-int/2addr v2, v5

    .line 685
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 686
    .line 687
    .line 688
    iput-boolean v0, v3, Ldefpackage/c40;->g:Z

    .line 689
    .line 690
    iput-boolean v5, v3, Ldefpackage/c40;->h:Z

    .line 691
    .line 692
    new-instance v2, Ldefpackage/e40;

    .line 693
    .line 694
    invoke-direct {v2, v3}, Ldefpackage/e40;-><init>(Ldefpackage/c40;)V

    .line 695
    .line 696
    .line 697
    :goto_f
    iget-object v0, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object v0, v1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 703
    .line 704
    iget-object v0, v0, Ldefpackage/bn2;->d:Ldefpackage/sm2;

    .line 705
    .line 706
    if-nez v0, :cond_17

    .line 707
    .line 708
    return-object v2

    .line 709
    :cond_17
    const-string v0, "DMediaSourceFactory"

    .line 710
    .line 711
    const-string v1, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."

    .line 712
    .line 713
    invoke-static {v0, v1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    return-object v2

    .line 717
    :catch_0
    move-exception v0

    .line 718
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 719
    .line 720
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 721
    .line 722
    .line 723
    throw v1

    .line 724
    :cond_18
    iget-wide v0, v4, Ldefpackage/bn2;->h:J

    .line 725
    .line 726
    sget-object v0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 727
    .line 728
    throw v3
.end method

.method public final e(Ldefpackage/yc5;)Ldefpackage/lt2;
    .locals 2

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/dm0;->a:Ldefpackage/au;

    .line 7
    .line 8
    iput-object p1, v0, Ldefpackage/au;->g:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, v0, Ldefpackage/au;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ldefpackage/lt2;

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ldefpackage/lt2;->e(Ldefpackage/yc5;)Ldefpackage/lt2;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object p0
.end method
