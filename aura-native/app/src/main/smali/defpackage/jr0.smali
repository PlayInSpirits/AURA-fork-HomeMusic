.class public final Ldefpackage/jr0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final G:Ldefpackage/ux3;

.field public static final H:Ljava/lang/String;

.field public static final I:Ljava/lang/String;

.field public static final J:Ljava/lang/String;

.field public static final K:Ljava/lang/String;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:J

.field public final E:Ldefpackage/fr4;

.field public final F:Ldefpackage/gr0;

.field public final n:Ldefpackage/ge3;

.field public final o:Ldefpackage/hr0;

.field public final p:J

.field public final q:Ldefpackage/ge3;

.field public final r:Ldefpackage/ge3;

.field public final s:Ldefpackage/ge3;

.field public t:J

.field public u:Ldefpackage/wu3;

.field public final v:Ljava/util/LinkedHashMap;

.field public w:I

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ux3;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/jr0;->G:Ldefpackage/ux3;

    .line 9
    .line 10
    const-string v0, "CLEAN"

    .line 11
    .line 12
    sput-object v0, Ldefpackage/jr0;->H:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "DIRTY"

    .line 15
    .line 16
    sput-object v0, Ldefpackage/jr0;->I:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "REMOVE"

    .line 19
    .line 20
    sput-object v0, Ldefpackage/jr0;->J:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "READ"

    .line 23
    .line 24
    sput-object v0, Ldefpackage/jr0;->K:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Ldefpackage/b71;Ldefpackage/ge3;Ldefpackage/gr4;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/jr0;->n:Ldefpackage/ge3;

    .line 11
    .line 12
    new-instance v0, Ldefpackage/hr0;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ldefpackage/hr0;-><init>(Ldefpackage/b71;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 18
    .line 19
    const-wide/32 v0, 0xa00000

    .line 20
    .line 21
    .line 22
    iput-wide v0, p0, Ldefpackage/jr0;->p:J

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    const/high16 v0, 0x3f400000    # 0.75f

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-virtual {p3}, Ldefpackage/gr4;->e()Ldefpackage/fr4;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ldefpackage/jr0;->E:Ldefpackage/fr4;

    .line 40
    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object p3, Ldefpackage/ze5;->c:Ljava/lang/String;

    .line 47
    .line 48
    const-string v0, " Cache"

    .line 49
    .line 50
    invoke-static {p1, p3, v0}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p3, Ldefpackage/gr0;

    .line 55
    .line 56
    invoke-direct {p3, p0, p1, v2}, Ldefpackage/gr0;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    iput-object p3, p0, Ldefpackage/jr0;->F:Ldefpackage/gr0;

    .line 60
    .line 61
    const-string p1, "journal"

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Ldefpackage/ge3;->d(Ljava/lang/String;)Ldefpackage/ge3;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 68
    .line 69
    const-string p1, "journal.tmp"

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ldefpackage/ge3;->d(Ljava/lang/String;)Ldefpackage/ge3;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Ldefpackage/jr0;->r:Ldefpackage/ge3;

    .line 76
    .line 77
    const-string p1, "journal.bkp"

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Ldefpackage/ge3;->d(Ljava/lang/String;)Ldefpackage/ge3;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 84
    .line 85
    return-void
.end method

.method public static R(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/jr0;->G:Ldefpackage/ux3;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ldefpackage/ux3;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 11
    .line 12
    invoke-static {p0, v0}, Ldefpackage/er1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F()V
    .locals 11

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ldefpackage/hr0;->k(Ldefpackage/ge3;)Ldefpackage/ej4;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Ldefpackage/xu3;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Ldefpackage/xu3;-><init>(Ldefpackage/ej4;)V

    .line 19
    .line 20
    .line 21
    const-wide v4, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    const-string v10, "libcore.io.DiskLruCache"

    .line 47
    .line 48
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_2

    .line 53
    .line 54
    const-string v10, "1"

    .line 55
    .line 56
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    if-eqz v10, :cond_2

    .line 61
    .line 62
    const v10, 0x31191

    .line 63
    .line 64
    .line 65
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-static {v10, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    const/4 v7, 0x2

    .line 76
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-static {v7, v8}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    if-gtz v7, :cond_2

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    :goto_0
    :try_start_1
    invoke-virtual {v3, v4, v5}, Ldefpackage/xu3;->t(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0, v1}, Ldefpackage/jr0;->H(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_2

    .line 105
    :catch_0
    :try_start_2
    iget-object v1, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    sub-int/2addr v0, v1

    .line 112
    iput v0, p0, Ldefpackage/jr0;->w:I

    .line 113
    .line 114
    invoke-virtual {v3}, Ldefpackage/xu3;->l()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_0

    .line 119
    .line 120
    invoke-virtual {p0}, Ldefpackage/jr0;->J()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_0
    iget-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 125
    .line 126
    if-eqz v0, :cond_1

    .line 127
    .line 128
    invoke-static {v0}, Ldefpackage/xe5;->b(Ljava/io/Closeable;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    invoke-virtual {p0}, Ldefpackage/jr0;->u()Ldefpackage/wu3;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iput-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    :goto_1
    :try_start_3
    invoke-virtual {v3}, Ldefpackage/xu3;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    goto :goto_3

    .line 142
    :catchall_1
    move-exception p0

    .line 143
    goto :goto_3

    .line 144
    :cond_2
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    .line 145
    .line 146
    new-instance v4, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const/16 v0, 0x5d

    .line 173
    .line 174
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 185
    :goto_2
    :try_start_5
    invoke-virtual {v3}, Ldefpackage/xu3;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :catchall_2
    move-exception v0

    .line 190
    invoke-static {p0, v0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    :goto_3
    if-nez p0, :cond_3

    .line 194
    .line 195
    return-void

    .line 196
    :cond_3
    throw p0
.end method

.method public final H(Ljava/lang/String;)V
    .locals 10

    .line 1
    const/4 v0, 0x6

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p1, v1, v2, v0}, Ldefpackage/qm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v3, "unexpected journal line: "

    .line 10
    .line 11
    const/4 v4, -0x1

    .line 12
    if-eq v0, v4, :cond_8

    .line 13
    .line 14
    add-int/lit8 v5, v0, 0x1

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    invoke-static {p1, v1, v5, v6}, Ldefpackage/qm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    if-ne v6, v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    sget-object v8, Ldefpackage/jr0;->J:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    if-ne v0, v9, :cond_1

    .line 36
    .line 37
    invoke-static {p1, v8, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    invoke-virtual {v7, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-virtual {p1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :cond_1
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    check-cast v8, Ldefpackage/dr0;

    .line 56
    .line 57
    if-nez v8, :cond_2

    .line 58
    .line 59
    new-instance v8, Ldefpackage/dr0;

    .line 60
    .line 61
    invoke-direct {v8, p0, v5}, Ldefpackage/dr0;-><init>(Ldefpackage/jr0;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v7, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_2
    if-eq v6, v4, :cond_4

    .line 68
    .line 69
    sget-object v5, Ldefpackage/jr0;->H:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-ne v0, v7, :cond_4

    .line 76
    .line 77
    invoke-static {p1, v5, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    const/4 p0, 0x1

    .line 84
    add-int/2addr v6, p0

    .line 85
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-array v0, p0, [C

    .line 90
    .line 91
    aput-char v1, v0, v2

    .line 92
    .line 93
    invoke-static {p1, v0}, Ldefpackage/qm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-boolean p0, v8, Ldefpackage/dr0;->e:Z

    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    iput-object p0, v8, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    iget-object v0, v8, Ldefpackage/dr0;->j:Ldefpackage/jr0;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x2

    .line 112
    if-ne p0, v0, :cond_3

    .line 113
    .line 114
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    :goto_0
    if-ge v2, p0, :cond_6

    .line 119
    .line 120
    iget-object v0, v8, Ldefpackage/dr0;->b:[J

    .line 121
    .line 122
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    aput-wide v4, v0, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    add-int/lit8 v2, v2, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :catch_0
    invoke-static {p1, v3}, Ldefpackage/tb4;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    invoke-static {p1, v3}, Ldefpackage/tb4;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    if-ne v6, v4, :cond_5

    .line 146
    .line 147
    sget-object v1, Ldefpackage/jr0;->I:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-ne v0, v5, :cond_5

    .line 154
    .line 155
    invoke-static {p1, v1, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_5

    .line 160
    .line 161
    new-instance p1, Ldefpackage/ll;

    .line 162
    .line 163
    invoke-direct {p1, p0, v8}, Ldefpackage/ll;-><init>(Ldefpackage/jr0;Ldefpackage/dr0;)V

    .line 164
    .line 165
    .line 166
    iput-object p1, v8, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    if-ne v6, v4, :cond_7

    .line 170
    .line 171
    sget-object p0, Ldefpackage/jr0;->K:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-ne v0, v1, :cond_7

    .line 178
    .line 179
    invoke-static {p1, p0, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-eqz p0, :cond_7

    .line 184
    .line 185
    :cond_6
    return-void

    .line 186
    :cond_7
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_8
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public final declared-synchronized J()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/wu3;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/jr0;->r:Ldefpackage/ge3;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ldefpackage/hr0;->j(Ldefpackage/ge3;)Ldefpackage/of4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v1, Ldefpackage/wu3;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :try_start_1
    const-string v2, "libcore.io.DiskLruCache"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 33
    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 38
    .line 39
    .line 40
    const-string v3, "1"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 46
    .line 47
    .line 48
    const-wide/32 v3, 0x31191

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v3, v4}, Ldefpackage/wu3;->Q(J)Ldefpackage/ew;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 55
    .line 56
    .line 57
    const-wide/16 v3, 0x2

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Ldefpackage/wu3;->Q(J)Ldefpackage/ew;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ldefpackage/dr0;

    .line 89
    .line 90
    iget-object v5, v4, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 91
    .line 92
    const/16 v6, 0x20

    .line 93
    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    sget-object v5, Ldefpackage/jr0;->I:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v1, v5}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v6}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 102
    .line 103
    .line 104
    iget-object v4, v4, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v1, v4}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception v2

    .line 114
    goto :goto_3

    .line 115
    :cond_1
    sget-object v5, Ldefpackage/jr0;->H:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v5}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v6}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 121
    .line 122
    .line 123
    iget-object v5, v4, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v1, v5}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 126
    .line 127
    .line 128
    iget-object v4, v4, Ldefpackage/dr0;->b:[J

    .line 129
    .line 130
    array-length v5, v4

    .line 131
    move v7, v0

    .line 132
    :goto_2
    if-ge v7, v5, :cond_2

    .line 133
    .line 134
    aget-wide v8, v4, v7

    .line 135
    .line 136
    invoke-virtual {v1, v6}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v8, v9}, Ldefpackage/wu3;->Q(J)Ldefpackage/ew;

    .line 140
    .line 141
    .line 142
    add-int/lit8 v7, v7, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Ldefpackage/wu3;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    goto :goto_5

    .line 154
    :catchall_2
    move-exception v1

    .line 155
    goto :goto_5

    .line 156
    :goto_3
    :try_start_3
    invoke-virtual {v1}, Ldefpackage/wu3;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :catchall_3
    move-exception v1

    .line 161
    :try_start_4
    invoke-static {v2, v1}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    move-object v1, v2

    .line 165
    :goto_5
    if-nez v1, :cond_6

    .line 166
    .line 167
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 168
    .line 169
    iget-object v2, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 172
    .line 173
    .line 174
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 175
    iget-object v2, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 176
    .line 177
    if-eqz v1, :cond_4

    .line 178
    .line 179
    :try_start_5
    iget-object v1, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 180
    .line 181
    iget-object v3, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 182
    .line 183
    invoke-virtual {v2, v1, v3}, Ldefpackage/hr0;->b(Ldefpackage/ge3;Ldefpackage/ge3;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 187
    .line 188
    iget-object v2, p0, Ldefpackage/jr0;->r:Ldefpackage/ge3;

    .line 189
    .line 190
    iget-object v3, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 191
    .line 192
    invoke-virtual {v1, v2, v3}, Ldefpackage/hr0;->b(Ldefpackage/ge3;Ldefpackage/ge3;)V

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 196
    .line 197
    iget-object v2, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 198
    .line 199
    invoke-static {v1, v2}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_4
    iget-object v1, p0, Ldefpackage/jr0;->r:Ldefpackage/ge3;

    .line 204
    .line 205
    iget-object v3, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 206
    .line 207
    invoke-virtual {v2, v1, v3}, Ldefpackage/hr0;->b(Ldefpackage/ge3;Ldefpackage/ge3;)V

    .line 208
    .line 209
    .line 210
    :goto_6
    iget-object v1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 211
    .line 212
    if-eqz v1, :cond_5

    .line 213
    .line 214
    invoke-static {v1}, Ldefpackage/xe5;->b(Ljava/io/Closeable;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    invoke-virtual {p0}, Ldefpackage/jr0;->u()Ldefpackage/wu3;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    iput-object v1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 222
    .line 223
    iput-boolean v0, p0, Ldefpackage/jr0;->x:Z

    .line 224
    .line 225
    iput-boolean v0, p0, Ldefpackage/jr0;->C:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 226
    .line 227
    monitor-exit p0

    .line 228
    return-void

    .line 229
    :cond_6
    :try_start_6
    throw v1

    .line 230
    :goto_7
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 231
    throw v0
.end method

.method public final K(Ldefpackage/dr0;)V
    .locals 10

    .line 1
    iget-object v0, p1, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Ldefpackage/jr0;->y:Z

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget v1, p1, Ldefpackage/dr0;->h:I

    .line 13
    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget-object v5, Ldefpackage/jr0;->I:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v5}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ldefpackage/wu3;->flush()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget v1, p1, Ldefpackage/dr0;->h:I

    .line 38
    .line 39
    if-gtz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p1, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    :cond_1
    iput-boolean v4, p1, Ldefpackage/dr0;->f:Z

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object v1, p1, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1}, Ldefpackage/ll;->d()V

    .line 53
    .line 54
    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    const/4 v5, 0x2

    .line 57
    if-ge v1, v5, :cond_4

    .line 58
    .line 59
    iget-object v5, p1, Ldefpackage/dr0;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Ldefpackage/ge3;

    .line 66
    .line 67
    iget-object v6, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 68
    .line 69
    invoke-static {v6, v5}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 70
    .line 71
    .line 72
    iget-wide v5, p0, Ldefpackage/jr0;->t:J

    .line 73
    .line 74
    iget-object v7, p1, Ldefpackage/dr0;->b:[J

    .line 75
    .line 76
    aget-wide v8, v7, v1

    .line 77
    .line 78
    sub-long/2addr v5, v8

    .line 79
    iput-wide v5, p0, Ldefpackage/jr0;->t:J

    .line 80
    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    aput-wide v5, v7, v1

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget p1, p0, Ldefpackage/jr0;->w:I

    .line 89
    .line 90
    add-int/2addr p1, v4

    .line 91
    iput p1, p0, Ldefpackage/jr0;->w:I

    .line 92
    .line 93
    iget-object p1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 94
    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    sget-object v1, Ldefpackage/jr0;->J:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v3}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-object p1, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ldefpackage/jr0;->s()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Ldefpackage/jr0;->E:Ldefpackage/fr4;

    .line 123
    .line 124
    iget-object p0, p0, Ldefpackage/jr0;->F:Ldefpackage/gr0;

    .line 125
    .line 126
    invoke-static {p1, p0}, Ldefpackage/fr4;->e(Ldefpackage/fr4;Ldefpackage/ar4;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    return-void
.end method

.method public final M()V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, Ldefpackage/jr0;->t:J

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/jr0;->p:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ldefpackage/dr0;

    .line 30
    .line 31
    iget-boolean v2, v1, Ldefpackage/dr0;->f:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ldefpackage/jr0;->K(Ldefpackage/dr0;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Ldefpackage/jr0;->B:Z

    .line 42
    .line 43
    return-void
.end method

.method public final declared-synchronized b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/jr0;->A:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v1

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/jr0;->z:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Ldefpackage/jr0;->A:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    new-array v3, v2, [Ldefpackage/dr0;

    .line 23
    .line 24
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [Ldefpackage/dr0;

    .line 29
    .line 30
    array-length v3, v0

    .line 31
    :goto_0
    if-ge v2, v3, :cond_2

    .line 32
    .line 33
    aget-object v4, v0, v2

    .line 34
    .line 35
    iget-object v4, v4, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ldefpackage/ll;->d()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0}, Ldefpackage/jr0;->M()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-static {v0}, Ldefpackage/xe5;->b(Ljava/io/Closeable;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 60
    .line 61
    iput-boolean v1, p0, Ldefpackage/jr0;->A:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-void

    .line 65
    :cond_4
    :goto_2
    :try_start_1
    iput-boolean v1, p0, Ldefpackage/jr0;->A:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    throw v0
.end method

.method public final declared-synchronized f(Ldefpackage/ll;Z)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Ldefpackage/ll;->p:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ldefpackage/dr0;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 7
    .line 8
    invoke-static {v1, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_e

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    iget-boolean v3, v0, Ldefpackage/dr0;->e:Z

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_2

    .line 24
    .line 25
    iget-object v4, p1, Ldefpackage/ll;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, [Z

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    aget-boolean v4, v4, v3

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-object v4, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 37
    .line 38
    iget-object v5, v0, Ldefpackage/dr0;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Ldefpackage/ge3;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Ldefpackage/ll;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ldefpackage/ll;->a()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v0, "Newly created entry didn\'t create value for index "

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_2
    move p1, v2

    .line 90
    :goto_1
    if-ge p1, v1, :cond_6

    .line 91
    .line 92
    iget-object v3, v0, Ldefpackage/dr0;->d:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Ldefpackage/ge3;

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget-boolean v4, v0, Ldefpackage/dr0;->f:Z

    .line 103
    .line 104
    if-nez v4, :cond_4

    .line 105
    .line 106
    iget-object v4, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 107
    .line 108
    invoke-virtual {v4, v3}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    iget-object v4, v0, Ldefpackage/dr0;->c:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ldefpackage/ge3;

    .line 121
    .line 122
    iget-object v5, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 123
    .line 124
    invoke-virtual {v5, v3, v4}, Ldefpackage/hr0;->b(Ldefpackage/ge3;Ldefpackage/ge3;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v0, Ldefpackage/dr0;->b:[J

    .line 128
    .line 129
    aget-wide v5, v3, p1

    .line 130
    .line 131
    iget-object v3, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ldefpackage/b71;->g(Ldefpackage/ge3;)Ldefpackage/xo0;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v3, v3, Ldefpackage/xo0;->e:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Ljava/lang/Long;

    .line 140
    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 144
    .line 145
    .line 146
    move-result-wide v3

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    const-wide/16 v3, 0x0

    .line 149
    .line 150
    :goto_2
    iget-object v7, v0, Ldefpackage/dr0;->b:[J

    .line 151
    .line 152
    aput-wide v3, v7, p1

    .line 153
    .line 154
    iget-wide v7, p0, Ldefpackage/jr0;->t:J

    .line 155
    .line 156
    sub-long/2addr v7, v5

    .line 157
    add-long/2addr v7, v3

    .line 158
    iput-wide v7, p0, Ldefpackage/jr0;->t:J

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    iget-object v4, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 162
    .line 163
    invoke-static {v4, v3}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    const/4 p1, 0x0

    .line 170
    iput-object p1, v0, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 171
    .line 172
    iget-boolean p1, v0, Ldefpackage/dr0;->f:Z

    .line 173
    .line 174
    if-eqz p1, :cond_7

    .line 175
    .line 176
    invoke-virtual {p0, v0}, Ldefpackage/jr0;->K(Ldefpackage/dr0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    .line 179
    monitor-exit p0

    .line 180
    return-void

    .line 181
    :cond_7
    :try_start_2
    iget p1, p0, Ldefpackage/jr0;->w:I

    .line 182
    .line 183
    const/4 v1, 0x1

    .line 184
    add-int/2addr p1, v1

    .line 185
    iput p1, p0, Ldefpackage/jr0;->w:I

    .line 186
    .line 187
    iget-object p1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-boolean v3, v0, Ldefpackage/dr0;->e:Z

    .line 193
    .line 194
    const/16 v4, 0xa

    .line 195
    .line 196
    const/16 v5, 0x20

    .line 197
    .line 198
    if-nez v3, :cond_9

    .line 199
    .line 200
    if-eqz p2, :cond_8

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    iget-object p2, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    iget-object v1, v0, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    sget-object p2, Ldefpackage/jr0;->J:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {p1, p2}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v5}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 216
    .line 217
    .line 218
    iget-object p2, v0, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {p1, p2}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v4}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    :goto_4
    iput-boolean v1, v0, Ldefpackage/dr0;->e:Z

    .line 228
    .line 229
    sget-object v1, Ldefpackage/jr0;->H:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {p1, v1}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v5}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 235
    .line 236
    .line 237
    iget-object v1, v0, Ldefpackage/dr0;->a:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {p1, v1}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 240
    .line 241
    .line 242
    iget-object v1, v0, Ldefpackage/dr0;->b:[J

    .line 243
    .line 244
    array-length v3, v1

    .line 245
    :goto_5
    if-ge v2, v3, :cond_a

    .line 246
    .line 247
    aget-wide v6, v1, v2

    .line 248
    .line 249
    invoke-virtual {p1, v5}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, v6, v7}, Ldefpackage/wu3;->Q(J)Ldefpackage/ew;

    .line 253
    .line 254
    .line 255
    add-int/lit8 v2, v2, 0x1

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_a
    invoke-virtual {p1, v4}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 259
    .line 260
    .line 261
    if-eqz p2, :cond_b

    .line 262
    .line 263
    iget-wide v1, p0, Ldefpackage/jr0;->D:J

    .line 264
    .line 265
    const-wide/16 v3, 0x1

    .line 266
    .line 267
    add-long/2addr v3, v1

    .line 268
    iput-wide v3, p0, Ldefpackage/jr0;->D:J

    .line 269
    .line 270
    iput-wide v1, v0, Ldefpackage/dr0;->i:J

    .line 271
    .line 272
    :cond_b
    :goto_6
    invoke-virtual {p1}, Ldefpackage/wu3;->flush()V

    .line 273
    .line 274
    .line 275
    iget-wide p1, p0, Ldefpackage/jr0;->t:J

    .line 276
    .line 277
    iget-wide v0, p0, Ldefpackage/jr0;->p:J

    .line 278
    .line 279
    cmp-long p1, p1, v0

    .line 280
    .line 281
    if-gtz p1, :cond_c

    .line 282
    .line 283
    invoke-virtual {p0}, Ldefpackage/jr0;->s()Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_d

    .line 288
    .line 289
    :cond_c
    iget-object p1, p0, Ldefpackage/jr0;->E:Ldefpackage/fr4;

    .line 290
    .line 291
    iget-object p2, p0, Ldefpackage/jr0;->F:Ldefpackage/gr0;

    .line 292
    .line 293
    invoke-static {p1, p2}, Ldefpackage/fr4;->e(Ldefpackage/fr4;Ldefpackage/ar4;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 294
    .line 295
    .line 296
    :cond_d
    monitor-exit p0

    .line 297
    return-void

    .line 298
    :cond_e
    :try_start_3
    const-string p1, "Check failed."

    .line 299
    .line 300
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 301
    .line 302
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw p2

    .line 306
    :goto_7
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 307
    throw p1
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/jr0;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/jr0;->b()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/jr0;->M()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ldefpackage/wu3;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw v0
.end method

.method public final declared-synchronized j(Ljava/lang/String;J)Ldefpackage/ll;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/jr0;->q()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/jr0;->b()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ldefpackage/jr0;->R(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ldefpackage/dr0;

    .line 21
    .line 22
    const-wide/16 v1, -0x1

    .line 23
    .line 24
    cmp-long v1, p2, v1

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-wide v3, v0, Ldefpackage/dr0;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    cmp-long p2, v3, p2

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_3

    .line 40
    :cond_0
    :goto_0
    monitor-exit p0

    .line 41
    return-object v2

    .line 42
    :cond_1
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :try_start_1
    iget-object p2, v0, Ldefpackage/dr0;->g:Ldefpackage/ll;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object p2, v2

    .line 48
    :goto_1
    if-eqz p2, :cond_3

    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-object v2

    .line 52
    :cond_3
    if-eqz v0, :cond_4

    .line 53
    .line 54
    :try_start_2
    iget p2, v0, Ldefpackage/dr0;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    monitor-exit p0

    .line 59
    return-object v2

    .line 60
    :cond_4
    :try_start_3
    iget-boolean p2, p0, Ldefpackage/jr0;->B:Z

    .line 61
    .line 62
    if-nez p2, :cond_8

    .line 63
    .line 64
    iget-boolean p2, p0, Ldefpackage/jr0;->C:Z

    .line 65
    .line 66
    if-eqz p2, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    iget-object p2, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object p3, Ldefpackage/jr0;->I:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p2, p3}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 77
    .line 78
    .line 79
    const/16 p3, 0x20

    .line 80
    .line 81
    invoke-virtual {p2, p3}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, p1}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 85
    .line 86
    .line 87
    const/16 p3, 0xa

    .line 88
    .line 89
    invoke-interface {p2, p3}, Ldefpackage/ew;->writeByte(I)Ldefpackage/ew;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ldefpackage/wu3;->flush()V

    .line 93
    .line 94
    .line 95
    iget-boolean p2, p0, Ldefpackage/jr0;->x:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    .line 97
    if-eqz p2, :cond_6

    .line 98
    .line 99
    monitor-exit p0

    .line 100
    return-object v2

    .line 101
    :cond_6
    if-nez v0, :cond_7

    .line 102
    .line 103
    :try_start_4
    new-instance v0, Ldefpackage/dr0;

    .line 104
    .line 105
    invoke-direct {v0, p0, p1}, Ldefpackage/dr0;-><init>(Ldefpackage/jr0;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object p2, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_7
    new-instance p1, Ldefpackage/ll;

    .line 114
    .line 115
    invoke-direct {p1, p0, v0}, Ldefpackage/ll;-><init>(Ldefpackage/jr0;Ldefpackage/dr0;)V

    .line 116
    .line 117
    .line 118
    iput-object p1, v0, Ldefpackage/dr0;->g:Ldefpackage/ll;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 119
    .line 120
    monitor-exit p0

    .line 121
    return-object p1

    .line 122
    :cond_8
    :goto_2
    :try_start_5
    iget-object p1, p0, Ldefpackage/jr0;->E:Ldefpackage/fr4;

    .line 123
    .line 124
    iget-object p2, p0, Ldefpackage/jr0;->F:Ldefpackage/gr0;

    .line 125
    .line 126
    invoke-static {p1, p2}, Ldefpackage/fr4;->e(Ldefpackage/fr4;Ldefpackage/ar4;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 127
    .line 128
    .line 129
    monitor-exit p0

    .line 130
    return-object v2

    .line 131
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 132
    throw p1
.end method

.method public final declared-synchronized n(Ljava/lang/String;)Ldefpackage/fr0;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/jr0;->q()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/jr0;->b()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ldefpackage/jr0;->R(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ldefpackage/dr0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v1

    .line 27
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ldefpackage/dr0;->a()Ldefpackage/fr0;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object v1

    .line 35
    :cond_1
    :try_start_2
    iget v1, p0, Ldefpackage/jr0;->w:I

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, p0, Ldefpackage/jr0;->w:I

    .line 40
    .line 41
    iget-object v1, p0, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v2, Ldefpackage/jr0;->K:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 49
    .line 50
    .line 51
    const/16 v2, 0x20

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ldefpackage/wu3;->writeByte(I)Ldefpackage/ew;

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, p1}, Ldefpackage/ew;->y(Ljava/lang/String;)Ldefpackage/ew;

    .line 57
    .line 58
    .line 59
    const/16 p1, 0xa

    .line 60
    .line 61
    invoke-interface {v1, p1}, Ldefpackage/ew;->writeByte(I)Ldefpackage/ew;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ldefpackage/jr0;->s()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Ldefpackage/jr0;->E:Ldefpackage/fr4;

    .line 71
    .line 72
    iget-object v1, p0, Ldefpackage/jr0;->F:Ldefpackage/gr0;

    .line 73
    .line 74
    invoke-static {p1, v1}, Ldefpackage/fr4;->e(Ldefpackage/fr4;Ldefpackage/ar4;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_0
    monitor-exit p0

    .line 81
    return-object v0

    .line 82
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    throw p1
.end method

.method public final declared-synchronized q()V
    .locals 7

    .line 1
    const-string v0, "DiskLruCache "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 5
    .line 6
    iget-boolean v1, p0, Ldefpackage/jr0;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 23
    .line 24
    iget-object v2, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    iget-object v2, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 31
    .line 32
    iget-object v3, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ldefpackage/hr0;->d(Ldefpackage/ge3;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v1}, Ldefpackage/hr0;->b(Ldefpackage/ge3;Ldefpackage/ge3;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 56
    .line 57
    iget-object v2, p0, Ldefpackage/jr0;->s:Ldefpackage/ge3;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ldefpackage/hr0;->j(Ldefpackage/ge3;)Ldefpackage/of4;

    .line 66
    .line 67
    .line 68
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    const/4 v4, 0x1

    .line 70
    const/4 v5, 0x0

    .line 71
    :try_start_3
    iget-object v6, v1, Ldefpackage/hr0;->c:Ldefpackage/b71;

    .line 72
    .line 73
    invoke-virtual {v6, v2}, Ldefpackage/b71;->d(Ldefpackage/ge3;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 74
    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 79
    .line 80
    .line 81
    :catchall_1
    :cond_3
    move v1, v4

    .line 82
    goto :goto_4

    .line 83
    :catchall_2
    move-exception v6

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    :try_start_5
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :catchall_3
    move-exception v3

    .line 91
    :try_start_6
    invoke-static {v6, v3}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :catch_0
    if-eqz v3, :cond_4

    .line 96
    .line 97
    :try_start_7
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_4
    move-exception v3

    .line 102
    :goto_1
    move-object v6, v3

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    const/4 v3, 0x0

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    :goto_3
    if-nez v6, :cond_7

    .line 107
    .line 108
    :try_start_8
    iget-object v1, v1, Ldefpackage/hr0;->c:Ldefpackage/b71;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ldefpackage/b71;->d(Ldefpackage/ge3;)V

    .line 111
    .line 112
    .line 113
    move v1, v5

    .line 114
    :goto_4
    iput-boolean v1, p0, Ldefpackage/jr0;->y:Z

    .line 115
    .line 116
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 117
    .line 118
    iget-object v2, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ldefpackage/b71;->e(Ldefpackage/ge3;)Z

    .line 121
    .line 122
    .line 123
    move-result v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 124
    if-eqz v1, :cond_6

    .line 125
    .line 126
    :try_start_9
    invoke-virtual {p0}, Ldefpackage/jr0;->F()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ldefpackage/jr0;->v()V

    .line 130
    .line 131
    .line 132
    iput-boolean v4, p0, Ldefpackage/jr0;->z:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 133
    .line 134
    monitor-exit p0

    .line 135
    return-void

    .line 136
    :catch_1
    move-exception v1

    .line 137
    :try_start_a
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 138
    .line 139
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 140
    .line 141
    new-instance v3, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Ldefpackage/jr0;->n:Ldefpackage/ge3;

    .line 147
    .line 148
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v0, " is corrupt: "

    .line 152
    .line 153
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v0, ", removing"

    .line 164
    .line 165
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const/4 v2, 0x5

    .line 176
    invoke-static {v0, v2, v1}, Ldefpackage/qg3;->i(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 177
    .line 178
    .line 179
    :try_start_b
    invoke-virtual {p0}, Ldefpackage/jr0;->close()V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 183
    .line 184
    iget-object v1, p0, Ldefpackage/jr0;->n:Ldefpackage/ge3;

    .line 185
    .line 186
    invoke-static {v0, v1}, Ldefpackage/xe5;->c(Ldefpackage/b71;Ldefpackage/ge3;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 187
    .line 188
    .line 189
    :try_start_c
    iput-boolean v5, p0, Ldefpackage/jr0;->A:Z

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :catchall_5
    move-exception v0

    .line 193
    iput-boolean v5, p0, Ldefpackage/jr0;->A:Z

    .line 194
    .line 195
    throw v0

    .line 196
    :cond_6
    :goto_5
    invoke-virtual {p0}, Ldefpackage/jr0;->J()V

    .line 197
    .line 198
    .line 199
    iput-boolean v4, p0, Ldefpackage/jr0;->z:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 200
    .line 201
    monitor-exit p0

    .line 202
    return-void

    .line 203
    :cond_7
    :try_start_d
    throw v6

    .line 204
    :goto_6
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 205
    throw v0
.end method

.method public final s()Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/jr0;->w:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-lt v0, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final u()Ldefpackage/wu3;
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/jr0;->q:Ldefpackage/ge3;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/hr0;->c:Ldefpackage/b71;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ldefpackage/b71;->a(Ldefpackage/ge3;)Ldefpackage/of4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ldefpackage/f61;

    .line 18
    .line 19
    new-instance v2, Ldefpackage/ir0;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, v3, p0}, Ldefpackage/ir0;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Ldefpackage/f61;-><init>(Ldefpackage/of4;Ldefpackage/if1;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Ldefpackage/wu3;

    .line 29
    .line 30
    invoke-direct {p0, v1}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final v()V
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/jr0;->r:Ldefpackage/ge3;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/jr0;->o:Ldefpackage/hr0;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/jr0;->v:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v2, Ldefpackage/dr0;

    .line 32
    .line 33
    iget-object v3, v2, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x0

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    :goto_1
    if-ge v5, v4, :cond_0

    .line 40
    .line 41
    iget-wide v6, p0, Ldefpackage/jr0;->t:J

    .line 42
    .line 43
    iget-object v3, v2, Ldefpackage/dr0;->b:[J

    .line 44
    .line 45
    aget-wide v8, v3, v5

    .line 46
    .line 47
    add-long/2addr v6, v8

    .line 48
    iput-wide v6, p0, Ldefpackage/jr0;->t:J

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v3, 0x0

    .line 54
    iput-object v3, v2, Ldefpackage/dr0;->g:Ldefpackage/ll;

    .line 55
    .line 56
    :goto_2
    if-ge v5, v4, :cond_2

    .line 57
    .line 58
    iget-object v3, v2, Ldefpackage/dr0;->c:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Ldefpackage/ge3;

    .line 65
    .line 66
    invoke-static {v1, v3}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 67
    .line 68
    .line 69
    iget-object v3, v2, Ldefpackage/dr0;->d:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ldefpackage/ge3;

    .line 76
    .line 77
    invoke-static {v1, v3}, Ldefpackage/xe5;->d(Ldefpackage/hr0;Ldefpackage/ge3;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    return-void
.end method
