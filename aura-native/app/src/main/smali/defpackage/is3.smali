.class public abstract Ldefpackage/is3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Ljava/util/WeakHashMap;

.field public static c:Lcom/eddyizm/tempus/service/MediaService;

.field public static d:Z

.field public static final e:Ldefpackage/k03;

.field public static final f:Ldefpackage/u6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldefpackage/is3;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ldefpackage/is3;->b:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    new-instance v0, Ldefpackage/k03;

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Ldefpackage/is3;->e:Ldefpackage/k03;

    .line 27
    .line 28
    new-instance v0, Ldefpackage/u6;

    .line 29
    .line 30
    const/16 v1, 0x11

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ldefpackage/u6;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Ldefpackage/is3;->f:Ldefpackage/u6;

    .line 36
    .line 37
    return-void
.end method

.method public static final a(Ldefpackage/qi3;Ldefpackage/ao2;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldefpackage/is3;->a:Landroid/os/Handler;

    .line 8
    .line 9
    sget-object v1, Ldefpackage/is3;->f:Ldefpackage/u6;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {p0}, Ldefpackage/is3;->e(Ldefpackage/qi3;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/b;->h(Ldefpackage/qi3;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    sget-object v5, Ldefpackage/is3;->e:Ldefpackage/k03;

    .line 27
    .line 28
    if-nez v4, :cond_c

    .line 29
    .line 30
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/a;->j(Ldefpackage/qi3;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_0
    if-eqz v2, :cond_a

    .line 39
    .line 40
    const-string v4, "continuous_play"

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    invoke-static {v4, v6}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-interface {p0}, Ldefpackage/qi3;->h()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v2}, Ldefpackage/is3;->c(Ldefpackage/gn2;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v4, :cond_a

    .line 56
    .line 57
    if-eqz v7, :cond_a

    .line 58
    .line 59
    if-nez v6, :cond_a

    .line 60
    .line 61
    const/4 v4, 0x7

    .line 62
    if-ge v3, v4, :cond_a

    .line 63
    .line 64
    sget-object v2, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_1
    sget-boolean v2, Ldefpackage/is3;->d:Z

    .line 75
    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    invoke-interface {p0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const/4 v4, 0x0

    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    move-object v2, v4

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-static {p0}, Ldefpackage/is3;->d(Ldefpackage/qi3;)[I

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface {p0}, Ldefpackage/qi3;->o0()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-static {v5, v6}, Ldefpackage/ti;->l0([II)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    new-instance v7, Ljava/util/ArrayList;

    .line 106
    .line 107
    array-length v8, v5

    .line 108
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    array-length v8, v5

    .line 112
    const/4 v9, 0x0

    .line 113
    :goto_0
    if-ge v9, v8, :cond_4

    .line 114
    .line 115
    aget v10, v5, v9

    .line 116
    .line 117
    invoke-interface {p0, v10}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    iget-object v10, v10, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    const/4 v8, -0x1

    .line 130
    if-ltz v6, :cond_6

    .line 131
    .line 132
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-ge v6, v9, :cond_6

    .line 137
    .line 138
    :goto_1
    if-ge v8, v6, :cond_6

    .line 139
    .line 140
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    check-cast v9, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v9}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-nez v9, :cond_5

    .line 151
    .line 152
    move v8, v6

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_6
    :goto_2
    if-ltz v8, :cond_7

    .line 158
    .line 159
    aget v2, v5, v8

    .line 160
    .line 161
    invoke-interface {p0, v2}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    :cond_7
    :goto_3
    if-nez v2, :cond_8

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    invoke-static {}, Ldefpackage/ud3;->T()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_9

    .line 173
    .line 174
    const-wide/16 p0, 0x2af8

    .line 175
    .line 176
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_9
    iget-object p0, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 181
    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v1, " track(s) ahead: continuous play from "

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const-string v0, "QueueAhead"

    .line 203
    .line 204
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    invoke-static {v2, p1, v4}, Ldefpackage/bo2;->c(Ldefpackage/gn2;Ldefpackage/ao2;Ldefpackage/vp;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_a
    if-gtz v3, :cond_b

    .line 212
    .line 213
    if-nez v2, :cond_d

    .line 214
    .line 215
    :cond_b
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_c
    :goto_4
    if-lez v3, :cond_d

    .line 222
    .line 223
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v5, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_d
    :goto_5
    return-void
.end method

.method public static final b(Ldefpackage/qi3;II)V
    .locals 3

    .line 1
    if-gtz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    sput-boolean v0, Ldefpackage/is3;->d:Z

    .line 7
    .line 8
    sget-object v0, Ldefpackage/is3;->e:Ldefpackage/k03;

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    if-lez p2, :cond_2

    .line 13
    .line 14
    if-ltz p1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ldefpackage/qi3;->Q0()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-ge p1, p2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p2, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ldefpackage/qi3;->g()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/4 v1, 0x4

    .line 39
    if-ne p2, v1, :cond_2

    .line 40
    .line 41
    :cond_1
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    invoke-interface {p0, p1, v1, v2}, Ldefpackage/qi3;->n(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p0}, Ldefpackage/qi3;->b()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ldefpackage/qi3;->m0()V

    .line 50
    .line 51
    .line 52
    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static c(Ldefpackage/gn2;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "type"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v1, "radio"

    .line 16
    .line 17
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    const-string v1, "podcast"

    .line 25
    .line 26
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    const-string v1, "audiobook"

    .line 33
    .line 34
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v0, "ir-"

    .line 46
    .line 47
    invoke-static {p0, v0, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_1
    return v2
.end method

.method public static final d(Ldefpackage/qi3;)[I
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/cu4;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-array p0, v2, [I

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ldefpackage/qi3;->D0()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0}, Ldefpackage/cu4;->o()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    new-array v3, v1, [I

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ldefpackage/cu4;->a(Z)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    move v5, v2

    .line 36
    :goto_0
    const/4 v6, -0x1

    .line 37
    if-eq v4, v6, :cond_1

    .line 38
    .line 39
    if-ge v5, v1, :cond_1

    .line 40
    .line 41
    add-int/lit8 v6, v5, 0x1

    .line 42
    .line 43
    aput v4, v3, v5

    .line 44
    .line 45
    invoke-virtual {v0, v4, v2, p0}, Ldefpackage/cu4;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    move v5, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-ne v5, v1, :cond_2

    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static final e(Ldefpackage/qi3;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/qi3;->o0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Ldefpackage/cu4;->p()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    if-eq v1, v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Ldefpackage/cu4;->o()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-lt v1, v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v4, v3

    .line 33
    :goto_0
    const/4 v5, 0x7

    .line 34
    if-ge v4, v5, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ldefpackage/qi3;->D0()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v0, v1, v3, v5}, Ldefpackage/cu4;->e(IIZ)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eq v1, v2, :cond_1

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return v4

    .line 50
    :cond_2
    :goto_1
    return v3
.end method
