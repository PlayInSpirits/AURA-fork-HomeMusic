.class public final Ldefpackage/ni2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/k51;


# static fields
.field public static final k0:[B

.field public static final l0:[B

.field public static final m0:[B

.field public static final n0:[B

.field public static final o0:Ljava/util/UUID;

.field public static final p0:Ljava/util/Map;


# instance fields
.field public A:I

.field public B:J

.field public final C:Landroid/util/SparseArray;

.field public D:Z

.field public E:J

.field public F:I

.field public G:J

.field public H:J

.field public I:I

.field public J:Z

.field public K:J

.field public L:J

.field public M:J

.field public N:Z

.field public O:I

.field public P:J

.field public Q:J

.field public R:I

.field public S:I

.field public T:[I

.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:Z

.field public Z:J

.field public final a:Ldefpackage/mk0;

.field public a0:I

.field public final b:Ldefpackage/k35;

.field public b0:I

.field public final c:Landroid/util/SparseArray;

.field public c0:I

.field public final d:Z

.field public d0:Z

.field public final e:Z

.field public e0:Z

.field public final f:Ldefpackage/xn4;

.field public f0:Z

.field public final g:Ldefpackage/be3;

.field public g0:I

.field public final h:Ldefpackage/be3;

.field public h0:B

.field public final i:Ldefpackage/be3;

.field public i0:Z

.field public final j:Ldefpackage/be3;

.field public j0:Ldefpackage/m51;

.field public final k:Ldefpackage/be3;

.field public final l:Ldefpackage/be3;

.field public final m:Ldefpackage/be3;

.field public final n:Ldefpackage/be3;

.field public final o:Ldefpackage/be3;

.field public final p:Ldefpackage/be3;

.field public q:Ljava/nio/ByteBuffer;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Z

.field public y:Ldefpackage/mi2;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Ldefpackage/ni2;->k0:[B

    .line 9
    .line 10
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Ldefpackage/ni2;->l0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Ldefpackage/ni2;->m0:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Ldefpackage/ni2;->n0:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ldefpackage/ni2;->o0:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v1, "htc_video_rotA-090"

    .line 61
    .line 62
    const/16 v2, 0x5a

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    const-string v4, "htc_video_rotA-000"

    .line 66
    .line 67
    invoke-static {v3, v0, v4, v2, v1}, Ldefpackage/xa3;->n(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "htc_video_rotA-270"

    .line 71
    .line 72
    const/16 v2, 0x10e

    .line 73
    .line 74
    const/16 v3, 0xb4

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-180"

    .line 77
    .line 78
    invoke-static {v3, v0, v4, v2, v1}, Ldefpackage/xa3;->n(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Ldefpackage/ni2;->p0:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(Ldefpackage/xn4;I)V
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/mk0;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/mk0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p0, Ldefpackage/ni2;->s:J

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v3, p0, Ldefpackage/ni2;->t:J

    .line 19
    .line 20
    iput-wide v3, p0, Ldefpackage/ni2;->u:J

    .line 21
    .line 22
    iput-wide v3, p0, Ldefpackage/ni2;->v:J

    .line 23
    .line 24
    iput-wide v3, p0, Ldefpackage/ni2;->E:J

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    iput v5, p0, Ldefpackage/ni2;->F:I

    .line 28
    .line 29
    iput-wide v1, p0, Ldefpackage/ni2;->G:J

    .line 30
    .line 31
    iput-wide v1, p0, Ldefpackage/ni2;->H:J

    .line 32
    .line 33
    iput v5, p0, Ldefpackage/ni2;->I:I

    .line 34
    .line 35
    iput-wide v1, p0, Ldefpackage/ni2;->K:J

    .line 36
    .line 37
    iput-wide v1, p0, Ldefpackage/ni2;->L:J

    .line 38
    .line 39
    iput-wide v3, p0, Ldefpackage/ni2;->M:J

    .line 40
    .line 41
    iput-object v0, p0, Ldefpackage/ni2;->a:Ldefpackage/mk0;

    .line 42
    .line 43
    new-instance v1, Ldefpackage/hg3;

    .line 44
    .line 45
    const/16 v2, 0x1c

    .line 46
    .line 47
    invoke-direct {v1, v2, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, v0, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    .line 51
    .line 52
    iput-object p1, p0, Ldefpackage/ni2;->f:Ldefpackage/xn4;

    .line 53
    .line 54
    new-instance p1, Landroid/util/SparseArray;

    .line 55
    .line 56
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Ldefpackage/ni2;->C:Landroid/util/SparseArray;

    .line 60
    .line 61
    and-int/lit8 p1, p2, 0x1

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    const/4 v1, 0x1

    .line 65
    if-nez p1, :cond_0

    .line 66
    .line 67
    move p1, v1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move p1, v0

    .line 70
    :goto_0
    iput-boolean p1, p0, Ldefpackage/ni2;->d:Z

    .line 71
    .line 72
    and-int/lit8 p1, p2, 0x2

    .line 73
    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    move v0, v1

    .line 77
    :cond_1
    iput-boolean v0, p0, Ldefpackage/ni2;->e:Z

    .line 78
    .line 79
    new-instance p1, Ldefpackage/k35;

    .line 80
    .line 81
    invoke-direct {p1}, Ldefpackage/k35;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Ldefpackage/ni2;->b:Ldefpackage/k35;

    .line 85
    .line 86
    new-instance p1, Landroid/util/SparseArray;

    .line 87
    .line 88
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Ldefpackage/ni2;->c:Landroid/util/SparseArray;

    .line 92
    .line 93
    new-instance p1, Ldefpackage/be3;

    .line 94
    .line 95
    const/4 p2, 0x4

    .line 96
    invoke-direct {p1, p2}, Ldefpackage/be3;-><init>(I)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Ldefpackage/ni2;->i:Ldefpackage/be3;

    .line 100
    .line 101
    new-instance p1, Ldefpackage/be3;

    .line 102
    .line 103
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p1, v0}, Ldefpackage/be3;-><init>([B)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Ldefpackage/ni2;->j:Ldefpackage/be3;

    .line 119
    .line 120
    new-instance p1, Ldefpackage/be3;

    .line 121
    .line 122
    invoke-direct {p1, p2}, Ldefpackage/be3;-><init>(I)V

    .line 123
    .line 124
    .line 125
    iput-object p1, p0, Ldefpackage/ni2;->k:Ldefpackage/be3;

    .line 126
    .line 127
    new-instance p1, Ldefpackage/be3;

    .line 128
    .line 129
    sget-object v0, Ldefpackage/uc5;->c:[B

    .line 130
    .line 131
    invoke-direct {p1, v0}, Ldefpackage/be3;-><init>([B)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Ldefpackage/ni2;->g:Ldefpackage/be3;

    .line 135
    .line 136
    new-instance p1, Ldefpackage/be3;

    .line 137
    .line 138
    invoke-direct {p1, p2}, Ldefpackage/be3;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Ldefpackage/ni2;->h:Ldefpackage/be3;

    .line 142
    .line 143
    new-instance p1, Ldefpackage/be3;

    .line 144
    .line 145
    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Ldefpackage/ni2;->l:Ldefpackage/be3;

    .line 149
    .line 150
    new-instance p1, Ldefpackage/be3;

    .line 151
    .line 152
    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, Ldefpackage/ni2;->m:Ldefpackage/be3;

    .line 156
    .line 157
    new-instance p1, Ldefpackage/be3;

    .line 158
    .line 159
    const/16 p2, 0x8

    .line 160
    .line 161
    invoke-direct {p1, p2}, Ldefpackage/be3;-><init>(I)V

    .line 162
    .line 163
    .line 164
    iput-object p1, p0, Ldefpackage/ni2;->n:Ldefpackage/be3;

    .line 165
    .line 166
    new-instance p1, Ldefpackage/be3;

    .line 167
    .line 168
    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Ldefpackage/ni2;->o:Ldefpackage/be3;

    .line 172
    .line 173
    new-instance p1, Ldefpackage/be3;

    .line 174
    .line 175
    invoke-direct {p1}, Ldefpackage/be3;-><init>()V

    .line 176
    .line 177
    .line 178
    iput-object p1, p0, Ldefpackage/ni2;->p:Ldefpackage/be3;

    .line 179
    .line 180
    new-array p1, v1, [I

    .line 181
    .line 182
    iput-object p1, p0, Ldefpackage/ni2;->T:[I

    .line 183
    .line 184
    iput-boolean v1, p0, Ldefpackage/ni2;->x:Z

    .line 185
    .line 186
    return-void
.end method

.method public static j(JJLjava/lang/String;)[B
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0xd693a400L

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    div-long v2, p0, v0

    .line 22
    .line 23
    long-to-int v2, v2

    .line 24
    int-to-long v3, v2

    .line 25
    mul-long/2addr v3, v0

    .line 26
    sub-long/2addr p0, v3

    .line 27
    const-wide/32 v0, 0x3938700

    .line 28
    .line 29
    .line 30
    div-long v3, p0, v0

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    int-to-long v4, v3

    .line 34
    mul-long/2addr v4, v0

    .line 35
    sub-long/2addr p0, v4

    .line 36
    const-wide/32 v0, 0xf4240

    .line 37
    .line 38
    .line 39
    div-long v4, p0, v0

    .line 40
    .line 41
    long-to-int v4, v4

    .line 42
    int-to-long v5, v4

    .line 43
    mul-long/2addr v5, v0

    .line 44
    sub-long/2addr p0, v5

    .line 45
    div-long/2addr p0, p2

    .line 46
    long-to-int p0, p0

    .line 47
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    filled-new-array {p2, p3, v0, p0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p1, p4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 74
    .line 75
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ldefpackage/l51;Ldefpackage/t71;)I
    .locals 43

    move-object/from16 v0, p0

    const/4 v3, 0x0

    .line 1
    iput-boolean v3, v0, Ldefpackage/ni2;->N:Z

    const/4 v4, 0x1

    move v5, v4

    :goto_0
    if-eqz v5, :cond_bf

    .line 2
    iget-boolean v7, v0, Ldefpackage/ni2;->N:Z

    if-nez v7, :cond_bf

    .line 3
    iget-object v7, v0, Ldefpackage/ni2;->a:Ldefpackage/mk0;

    iget-object v8, v7, Ldefpackage/mk0;->c:Ldefpackage/k35;

    .line 4
    iget-object v9, v7, Ldefpackage/mk0;->b:Ljava/util/ArrayDeque;

    iget-object v5, v7, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldefpackage/lk0;

    const-wide/16 v16, 0x0

    const/16 v18, 0x8

    const v15, 0x1654ae6b

    const-wide/16 v20, -0x1

    const v13, 0x1549a966

    const v14, 0x1c53bb6b

    if-eqz v5, :cond_a4

    .line 7
    invoke-interface/range {p1 .. p1}, Ldefpackage/l51;->getPosition()J

    move-result-wide v23

    .line 8
    iget-wide v10, v5, Ldefpackage/lk0;->b:J

    cmp-long v5, v23, v10

    if-ltz v5, :cond_a4

    .line 9
    iget-object v5, v7, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    invoke-virtual {v9}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldefpackage/lk0;

    .line 10
    iget v7, v7, Ldefpackage/lk0;->a:I

    .line 11
    iget-object v5, v5, Ldefpackage/hg3;->o:Ljava/lang/Object;

    check-cast v5, Ldefpackage/ni2;

    .line 12
    iget-object v8, v5, Ldefpackage/ni2;->C:Landroid/util/SparseArray;

    .line 13
    iget-object v9, v5, Ldefpackage/ni2;->c:Landroid/util/SparseArray;

    .line 14
    iget-object v10, v5, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    .line 15
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v10, 0xa0

    .line 16
    const-string v11, "A_OPUS"

    if-eq v7, v10, :cond_9e

    const/16 v10, 0xae

    const-string v6, "video/webm"

    if-eq v7, v10, :cond_2c

    const/16 v10, 0xb7

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v7, v10, :cond_2a

    const/16 v10, 0x4dbb

    if-eq v7, v10, :cond_28

    const/16 v10, 0x6240

    if-eq v7, v10, :cond_26

    const/16 v6, 0x6d80

    if-eq v7, v6, :cond_24

    if-eq v7, v13, :cond_22

    if-eq v7, v15, :cond_12

    if-eq v7, v14, :cond_0

    goto/16 :goto_3f

    .line 17
    :cond_0
    iget-boolean v6, v5, Ldefpackage/ni2;->z:Z

    if-nez v6, :cond_20

    move v6, v3

    .line 18
    :goto_2
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v6, v7, :cond_4

    .line 19
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    .line 20
    iget-wide v6, v5, Ldefpackage/ni2;->v:J

    cmp-long v6, v6, v18

    if-nez v6, :cond_1

    goto :goto_4

    :cond_1
    move v6, v3

    .line 21
    :goto_3
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v6, v7, :cond_2

    .line 22
    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 23
    :cond_2
    new-instance v27, Ldefpackage/li2;

    iget-wide v6, v5, Ldefpackage/ni2;->v:J

    iget v10, v5, Ldefpackage/ni2;->I:I

    iget-wide v13, v5, Ldefpackage/ni2;->s:J

    move-wide/from16 v32, v13

    iget-wide v12, v5, Ldefpackage/ni2;->r:J

    move-wide/from16 v29, v6

    move-object/from16 v28, v8

    move/from16 v31, v10

    move-wide/from16 v34, v12

    invoke-direct/range {v27 .. v35}, Ldefpackage/li2;-><init>(Landroid/util/SparseArray;JIJJ)V

    move-object/from16 v6, v27

    .line 24
    iget-object v7, v5, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    invoke-interface {v7, v6}, Ldefpackage/m51;->w(Ldefpackage/m84;)V

    goto :goto_5

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 25
    :cond_4
    :goto_4
    iget-object v6, v5, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    new-instance v7, Ldefpackage/bo;

    iget-wide v10, v5, Ldefpackage/ni2;->v:J

    invoke-direct {v7, v10, v11}, Ldefpackage/bo;-><init>(J)V

    invoke-interface {v6, v7}, Ldefpackage/m51;->w(Ldefpackage/m84;)V

    .line 26
    :goto_5
    iput-boolean v4, v5, Ldefpackage/ni2;->z:Z

    .line 27
    iput-boolean v3, v5, Ldefpackage/ni2;->D:Z

    move v6, v3

    .line 28
    :goto_6
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v6, v7, :cond_11

    .line 29
    invoke-virtual {v9, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldefpackage/mi2;

    .line 30
    iget-wide v10, v5, Ldefpackage/ni2;->v:J

    iget-wide v12, v5, Ldefpackage/ni2;->s:J

    iget-wide v14, v5, Ldefpackage/ni2;->r:J

    move/from16 v34, v3

    .line 31
    iget v3, v7, Ldefpackage/mi2;->e:I

    move/from16 v35, v4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    :cond_5
    :goto_7
    move/from16 v22, v6

    goto/16 :goto_e

    .line 32
    :cond_6
    iget v3, v7, Ldefpackage/mi2;->d:I

    invoke-virtual {v8, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_5

    .line 33
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_7

    .line 34
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8

    move/from16 v22, v6

    :goto_8
    move-wide/from16 v3, v18

    goto/16 :goto_c

    .line 35
    :cond_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move/from16 v22, v6

    const/16 v6, 0x14

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    const-wide/16 v26, 0x0

    move-wide/from16 v28, v10

    move/from16 v10, v34

    const/4 v6, -0x1

    :goto_9
    if-ge v10, v4, :cond_9

    .line 36
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ldefpackage/ki2;

    move-wide/from16 v30, v12

    .line 37
    iget-wide v12, v11, Ldefpackage/ki2;->n:J

    move-wide/from16 v32, v12

    iget-wide v12, v11, Ldefpackage/ki2;->p:J

    move-wide/from16 v37, v12

    iget-wide v11, v11, Ldefpackage/ki2;->o:J

    const-wide/32 v39, 0x989680

    cmp-long v13, v32, v39

    if-lez v13, :cond_a

    :cond_9
    const/4 v4, -0x1

    goto :goto_b

    .line 38
    :cond_a
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v13

    add-int/lit8 v13, v13, -0x1

    if-ge v10, v13, :cond_b

    add-int/lit8 v13, v10, 0x1

    .line 39
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ldefpackage/ki2;

    move/from16 v23, v10

    move-wide/from16 v39, v11

    .line 40
    iget-wide v10, v13, Ldefpackage/ki2;->o:J

    move-wide/from16 v41, v10

    .line 41
    iget-wide v10, v13, Ldefpackage/ki2;->p:J

    add-long v10, v41, v10

    add-long v37, v39, v37

    sub-long v10, v10, v37

    .line 42
    iget-wide v12, v13, Ldefpackage/ki2;->n:J

    sub-long v12, v12, v32

    goto :goto_a

    :cond_b
    move/from16 v23, v10

    move-wide/from16 v39, v11

    add-long v12, v30, v14

    add-long v10, v39, v37

    sub-long v10, v12, v10

    sub-long v12, v28, v32

    :goto_a
    cmp-long v32, v12, v16

    if-lez v32, :cond_c

    long-to-double v10, v10

    long-to-double v12, v12

    div-double/2addr v10, v12

    cmpl-double v12, v10, v26

    if-lez v12, :cond_c

    move-wide/from16 v26, v10

    move/from16 v6, v23

    :cond_c
    add-int/lit8 v10, v23, 0x1

    move-wide/from16 v12, v30

    goto :goto_9

    :goto_b
    if-ne v6, v4, :cond_d

    goto :goto_8

    .line 43
    :cond_d
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldefpackage/ki2;

    .line 44
    iget-wide v3, v3, Ldefpackage/ki2;->n:J

    :goto_c
    cmp-long v6, v3, v18

    if-eqz v6, :cond_f

    .line 45
    iget-object v6, v7, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 46
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    iget-object v6, v6, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 48
    new-instance v10, Ldefpackage/rt4;

    invoke-direct {v10, v3, v4}, Ldefpackage/rt4;-><init>(J)V

    if-nez v6, :cond_e

    .line 49
    new-instance v3, Ldefpackage/qv2;

    move/from16 v4, v35

    new-array v6, v4, [Ldefpackage/pv2;

    aput-object v10, v6, v34

    invoke-direct {v3, v6}, Ldefpackage/qv2;-><init>([Ldefpackage/pv2;)V

    goto :goto_d

    :cond_e
    move/from16 v4, v35

    .line 50
    new-array v3, v4, [Ldefpackage/pv2;

    aput-object v10, v3, v34

    invoke-virtual {v6, v3}, Ldefpackage/qv2;->a([Ldefpackage/pv2;)Ldefpackage/qv2;

    move-result-object v3

    .line 51
    :goto_d
    iget-object v4, v7, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    invoke-virtual {v4}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    move-result-object v4

    .line 52
    iput-object v3, v4, Ldefpackage/sb1;->k:Ldefpackage/qv2;

    .line 53
    new-instance v3, Ldefpackage/tb1;

    invoke-direct {v3, v4}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 54
    iput-object v3, v7, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 55
    :cond_f
    :goto_e
    iget-boolean v3, v7, Ldefpackage/mi2;->W:Z

    if-nez v3, :cond_10

    .line 56
    iget-object v3, v7, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    iget-object v3, v7, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    iget-object v4, v7, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-interface {v3, v4}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    :cond_10
    add-int/lit8 v6, v22, 0x1

    move/from16 v3, v34

    const/4 v4, 0x1

    goto/16 :goto_6

    :cond_11
    move/from16 v34, v3

    .line 61
    invoke-virtual {v5}, Ldefpackage/ni2;->k()V

    move/from16 v4, v34

    goto/16 :goto_42

    :cond_12
    move/from16 v34, v3

    .line 62
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-eqz v3, :cond_21

    .line 63
    iget-boolean v3, v5, Ldefpackage/ni2;->d:Z

    if-eqz v3, :cond_14

    iget-wide v3, v5, Ldefpackage/ni2;->K:J

    cmp-long v3, v3, v20

    if-nez v3, :cond_13

    goto :goto_f

    :cond_13
    move/from16 v3, v34

    goto :goto_10

    :cond_14
    :goto_f
    const/4 v3, 0x1

    :goto_10
    move/from16 v10, v34

    const/4 v4, -0x1

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    .line 64
    :goto_11
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v11

    if-ge v10, v11, :cond_1a

    .line 65
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ldefpackage/mi2;

    .line 66
    iget v12, v11, Ldefpackage/mi2;->e:I

    const/4 v13, 0x2

    if-ne v12, v13, :cond_16

    .line 67
    iget-boolean v12, v11, Ldefpackage/mi2;->Y:Z

    if-eqz v12, :cond_15

    .line 68
    iget v4, v11, Ldefpackage/mi2;->d:I

    :cond_15
    const/4 v13, -0x1

    if-ne v6, v13, :cond_18

    .line 69
    iget v6, v11, Ldefpackage/mi2;->d:I

    goto :goto_12

    :cond_16
    const/4 v13, -0x1

    const/4 v14, 0x1

    if-ne v12, v14, :cond_18

    .line 70
    iget-boolean v12, v11, Ldefpackage/mi2;->Y:Z

    if-eqz v12, :cond_17

    .line 71
    iget v7, v11, Ldefpackage/mi2;->d:I

    :cond_17
    if-ne v8, v13, :cond_18

    .line 72
    iget v8, v11, Ldefpackage/mi2;->d:I

    :cond_18
    :goto_12
    if-eqz v3, :cond_19

    .line 73
    iget-object v12, v11, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 74
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iget-boolean v12, v11, Ldefpackage/mi2;->W:Z

    if-nez v12, :cond_19

    .line 76
    iget-object v12, v11, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    iget-object v11, v11, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 77
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-interface {v12, v11}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    :cond_19
    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    :cond_1a
    const/4 v13, -0x1

    if-eq v4, v13, :cond_1b

    .line 79
    iput v4, v5, Ldefpackage/ni2;->I:I

    goto :goto_14

    :cond_1b
    if-eq v6, v13, :cond_1c

    .line 80
    iput v6, v5, Ldefpackage/ni2;->I:I

    goto :goto_14

    :cond_1c
    if-eq v7, v13, :cond_1d

    .line 81
    iput v7, v5, Ldefpackage/ni2;->I:I

    goto :goto_14

    :cond_1d
    if-eq v8, v13, :cond_1e

    .line 82
    iput v8, v5, Ldefpackage/ni2;->I:I

    goto :goto_14

    .line 83
    :cond_1e
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-lez v4, :cond_1f

    move/from16 v4, v34

    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldefpackage/mi2;

    iget v6, v6, Ldefpackage/mi2;->d:I

    goto :goto_13

    :cond_1f
    const/4 v6, -0x1

    :goto_13
    iput v6, v5, Ldefpackage/ni2;->I:I

    :goto_14
    if-eqz v3, :cond_20

    .line 84
    invoke-virtual {v5}, Ldefpackage/ni2;->k()V

    :cond_20
    :goto_15
    const/4 v4, 0x0

    goto/16 :goto_42

    .line 85
    :cond_21
    const-string v0, "No valid tracks were found"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 86
    :cond_22
    iget-wide v3, v5, Ldefpackage/ni2;->t:J

    cmp-long v3, v3, v18

    if-nez v3, :cond_23

    const-wide/32 v3, 0xf4240

    .line 87
    iput-wide v3, v5, Ldefpackage/ni2;->t:J

    .line 88
    :cond_23
    iget-wide v3, v5, Ldefpackage/ni2;->u:J

    cmp-long v6, v3, v18

    if-eqz v6, :cond_20

    .line 89
    invoke-virtual {v5, v3, v4}, Ldefpackage/ni2;->n(J)J

    move-result-wide v3

    iput-wide v3, v5, Ldefpackage/ni2;->v:J

    goto :goto_15

    .line 90
    :cond_24
    invoke-virtual {v5, v7}, Ldefpackage/ni2;->h(I)V

    .line 91
    iget-object v3, v5, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    iget-boolean v4, v3, Ldefpackage/mi2;->i:Z

    if-eqz v4, :cond_20

    iget-object v3, v3, Ldefpackage/mi2;->j:[B

    if-nez v3, :cond_25

    goto/16 :goto_3f

    .line 92
    :cond_25
    const-string v0, "Combining encryption and compression is not supported"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 93
    :cond_26
    invoke-virtual {v5, v7}, Ldefpackage/ni2;->h(I)V

    .line 94
    iget-object v3, v5, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    iget-boolean v4, v3, Ldefpackage/mi2;->i:Z

    if-eqz v4, :cond_20

    .line 95
    iget-object v4, v3, Ldefpackage/mi2;->k:Ldefpackage/vv4;

    if-eqz v4, :cond_27

    .line 96
    new-instance v5, Ldefpackage/ow0;

    new-instance v7, Ldefpackage/nw0;

    sget-object v8, Ldefpackage/ax;->a:Ljava/util/UUID;

    iget-object v4, v4, Ldefpackage/vv4;->b:[B

    const/4 v9, 0x0

    .line 97
    invoke-direct {v7, v8, v9, v6, v4}, Ldefpackage/nw0;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 98
    filled-new-array {v7}, [Ldefpackage/nw0;

    move-result-object v4

    const/4 v14, 0x1

    .line 99
    invoke-direct {v5, v9, v14, v4}, Ldefpackage/ow0;-><init>(Ljava/lang/String;Z[Ldefpackage/nw0;)V

    .line 100
    iput-object v5, v3, Ldefpackage/mi2;->m:Ldefpackage/ow0;

    goto :goto_15

    :cond_27
    const/4 v9, 0x0

    .line 101
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    invoke-static {v9, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 102
    :cond_28
    iget v3, v5, Ldefpackage/ni2;->A:I

    const/4 v13, -0x1

    if-eq v3, v13, :cond_29

    iget-wide v6, v5, Ldefpackage/ni2;->B:J

    cmp-long v4, v6, v20

    if-eqz v4, :cond_29

    if-ne v3, v14, :cond_20

    .line 103
    iput-wide v6, v5, Ldefpackage/ni2;->K:J

    goto :goto_15

    .line 104
    :cond_29
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 105
    :cond_2a
    iget-boolean v3, v5, Ldefpackage/ni2;->z:Z

    if-nez v3, :cond_20

    .line 106
    invoke-virtual {v5, v7}, Ldefpackage/ni2;->g(I)V

    .line 107
    iget-wide v3, v5, Ldefpackage/ni2;->E:J

    cmp-long v3, v3, v18

    if-eqz v3, :cond_20

    iget v3, v5, Ldefpackage/ni2;->F:I

    const/4 v13, -0x1

    if-eq v3, v13, :cond_20

    iget-wide v6, v5, Ldefpackage/ni2;->G:J

    cmp-long v4, v6, v20

    if-eqz v4, :cond_20

    .line 108
    invoke-virtual {v8, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_2b

    .line 109
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 110
    iget v4, v5, Ldefpackage/ni2;->F:I

    invoke-virtual {v8, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 111
    :cond_2b
    new-instance v6, Ldefpackage/ki2;

    iget-wide v7, v5, Ldefpackage/ni2;->E:J

    iget-wide v9, v5, Ldefpackage/ni2;->s:J

    iget-wide v11, v5, Ldefpackage/ni2;->G:J

    add-long/2addr v9, v11

    iget-wide v11, v5, Ldefpackage/ni2;->H:J

    invoke-direct/range {v6 .. v12}, Ldefpackage/ki2;-><init>(JJJ)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_15

    .line 112
    :cond_2c
    iget-object v3, v5, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    iget-object v4, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    if-eqz v4, :cond_9d

    .line 115
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    const-string v8, "A_MPEG/L3"

    const-string v10, "A_MPEG/L2"

    const-string v12, "A_VORBIS"

    const-string v13, "A_TRUEHD"

    const-string v14, "A_MS/ACM"

    const-string v15, "V_MPEG4/ISO/SP"

    move-object/from16 v27, v6

    const-string v6, "V_MPEG4/ISO/AP"

    move/from16 v16, v7

    sparse-switch v16, :sswitch_data_0

    :goto_16
    const/4 v7, -0x1

    goto/16 :goto_17

    :sswitch_0
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_2d

    goto :goto_16

    :cond_2d
    const/16 v16, 0x21

    move/from16 v7, v16

    goto/16 :goto_17

    :sswitch_1
    const-string v7, "A_FLAC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2e

    goto :goto_16

    :cond_2e
    const/16 v7, 0x20

    goto/16 :goto_17

    :sswitch_2
    const-string v7, "A_EAC3"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2f

    goto :goto_16

    :cond_2f
    const/16 v7, 0x1f

    goto/16 :goto_17

    :sswitch_3
    const-string v7, "V_MPEG2"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_30

    goto :goto_16

    :cond_30
    const/16 v7, 0x1e

    goto/16 :goto_17

    :sswitch_4
    const-string v7, "S_TEXT/UTF8"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_31

    goto :goto_16

    :cond_31
    const/16 v7, 0x1d

    goto/16 :goto_17

    :sswitch_5
    const-string v7, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_32

    goto :goto_16

    :cond_32
    const/16 v7, 0x1c

    goto/16 :goto_17

    :sswitch_6
    const-string v7, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    goto :goto_16

    :cond_33
    const/16 v7, 0x1b

    goto/16 :goto_17

    :sswitch_7
    const-string v7, "S_TEXT/SSA"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_34

    goto :goto_16

    :cond_34
    const/16 v7, 0x1a

    goto/16 :goto_17

    :sswitch_8
    const-string v7, "S_TEXT/ASS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_35

    goto :goto_16

    :cond_35
    const/16 v7, 0x19

    goto/16 :goto_17

    :sswitch_9
    const-string v7, "A_PCM/INT/LIT"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    goto/16 :goto_16

    :cond_36
    const/16 v7, 0x18

    goto/16 :goto_17

    :sswitch_a
    const-string v7, "A_PCM/INT/BIG"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_37

    goto/16 :goto_16

    :cond_37
    const/16 v7, 0x17

    goto/16 :goto_17

    :sswitch_b
    const-string v7, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_38

    goto/16 :goto_16

    :cond_38
    const/16 v7, 0x16

    goto/16 :goto_17

    :sswitch_c
    const-string v7, "A_DTS/EXPRESS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_39

    goto/16 :goto_16

    :cond_39
    const/16 v7, 0x15

    goto/16 :goto_17

    :sswitch_d
    const-string v7, "V_THEORA"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3a

    goto/16 :goto_16

    :cond_3a
    const/16 v7, 0x14

    goto/16 :goto_17

    :sswitch_e
    const-string v7, "S_HDMV/PGS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3b

    goto/16 :goto_16

    :cond_3b
    const/16 v7, 0x13

    goto/16 :goto_17

    :sswitch_f
    const-string v7, "V_VP9"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3c

    goto/16 :goto_16

    :cond_3c
    const/16 v7, 0x12

    goto/16 :goto_17

    :sswitch_10
    const-string v7, "V_VP8"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3d

    goto/16 :goto_16

    :cond_3d
    const/16 v7, 0x11

    goto/16 :goto_17

    :sswitch_11
    const-string v7, "V_AV1"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3e

    goto/16 :goto_16

    :cond_3e
    const/16 v7, 0x10

    goto/16 :goto_17

    :sswitch_12
    const-string v7, "A_DTS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3f

    goto/16 :goto_16

    :cond_3f
    const/16 v7, 0xf

    goto/16 :goto_17

    :sswitch_13
    const-string v7, "A_AC3"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_40

    goto/16 :goto_16

    :cond_40
    const/16 v7, 0xe

    goto/16 :goto_17

    :sswitch_14
    const-string v7, "A_AAC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_41

    goto/16 :goto_16

    :cond_41
    const/16 v7, 0xd

    goto/16 :goto_17

    :sswitch_15
    const-string v7, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_42

    goto/16 :goto_16

    :cond_42
    const/16 v7, 0xc

    goto/16 :goto_17

    :sswitch_16
    const-string v7, "S_VOBSUB"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_43

    goto/16 :goto_16

    :cond_43
    const/16 v7, 0xb

    goto/16 :goto_17

    :sswitch_17
    const-string v7, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_44

    goto/16 :goto_16

    :cond_44
    const/16 v7, 0xa

    goto/16 :goto_17

    :sswitch_18
    const-string v7, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_45

    goto/16 :goto_16

    :cond_45
    const/16 v7, 0x9

    goto/16 :goto_17

    :sswitch_19
    const-string v7, "S_DVBSUB"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_46

    goto/16 :goto_16

    :cond_46
    move/from16 v7, v18

    goto :goto_17

    :sswitch_1a
    const-string v7, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_47

    goto/16 :goto_16

    :cond_47
    const/4 v7, 0x7

    goto :goto_17

    :sswitch_1b
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_48

    goto/16 :goto_16

    :cond_48
    const/4 v7, 0x6

    goto :goto_17

    :sswitch_1c
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_49

    goto/16 :goto_16

    :cond_49
    const/4 v7, 0x5

    goto :goto_17

    :sswitch_1d
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4a

    goto/16 :goto_16

    :cond_4a
    const/4 v7, 0x4

    goto :goto_17

    :sswitch_1e
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4b

    goto/16 :goto_16

    :cond_4b
    const/4 v7, 0x3

    goto :goto_17

    :sswitch_1f
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4c

    goto/16 :goto_16

    :cond_4c
    const/4 v7, 0x2

    goto :goto_17

    :sswitch_20
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4d

    goto/16 :goto_16

    :cond_4d
    const/4 v7, 0x1

    goto :goto_17

    :sswitch_21
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4e

    goto/16 :goto_16

    :cond_4e
    const/4 v7, 0x0

    :goto_17
    packed-switch v7, :pswitch_data_0

    :goto_18
    const/4 v1, 0x0

    goto/16 :goto_3e

    .line 116
    :pswitch_0
    iget v7, v3, Ldefpackage/mi2;->d:I

    .line 117
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v31

    sparse-switch v31, :sswitch_data_1

    :goto_19
    const/4 v15, -0x1

    goto/16 :goto_1a

    :sswitch_22
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4f

    goto :goto_19

    :cond_4f
    const/16 v15, 0x21

    goto/16 :goto_1a

    :sswitch_23
    const-string v6, "A_FLAC"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_50

    goto :goto_19

    :cond_50
    const/16 v15, 0x20

    goto/16 :goto_1a

    :sswitch_24
    const-string v6, "A_EAC3"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_51

    goto :goto_19

    :cond_51
    const/16 v15, 0x1f

    goto/16 :goto_1a

    :sswitch_25
    const-string v6, "V_MPEG2"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_52

    goto :goto_19

    :cond_52
    const/16 v15, 0x1e

    goto/16 :goto_1a

    :sswitch_26
    const-string v6, "S_TEXT/UTF8"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_53

    goto :goto_19

    :cond_53
    const/16 v15, 0x1d

    goto/16 :goto_1a

    :sswitch_27
    const-string v6, "S_TEXT/WEBVTT"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_54

    goto :goto_19

    :cond_54
    const/16 v15, 0x1c

    goto/16 :goto_1a

    :sswitch_28
    const-string v6, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_55

    goto :goto_19

    :cond_55
    const/16 v15, 0x1b

    goto/16 :goto_1a

    :sswitch_29
    const-string v6, "S_TEXT/SSA"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_56

    goto :goto_19

    :cond_56
    const/16 v15, 0x1a

    goto/16 :goto_1a

    :sswitch_2a
    const-string v6, "S_TEXT/ASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_57

    goto :goto_19

    :cond_57
    const/16 v15, 0x19

    goto/16 :goto_1a

    :sswitch_2b
    const-string v6, "A_PCM/INT/LIT"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_58

    goto :goto_19

    :cond_58
    const/16 v15, 0x18

    goto/16 :goto_1a

    :sswitch_2c
    const-string v6, "A_PCM/INT/BIG"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_59

    goto/16 :goto_19

    :cond_59
    const/16 v15, 0x17

    goto/16 :goto_1a

    :sswitch_2d
    const-string v6, "A_PCM/FLOAT/IEEE"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5a

    goto/16 :goto_19

    :cond_5a
    const/16 v15, 0x16

    goto/16 :goto_1a

    :sswitch_2e
    const-string v6, "A_DTS/EXPRESS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5b

    goto/16 :goto_19

    :cond_5b
    const/16 v15, 0x15

    goto/16 :goto_1a

    :sswitch_2f
    const-string v6, "V_THEORA"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5c

    goto/16 :goto_19

    :cond_5c
    const/16 v15, 0x14

    goto/16 :goto_1a

    :sswitch_30
    const-string v6, "S_HDMV/PGS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5d

    goto/16 :goto_19

    :cond_5d
    const/16 v15, 0x13

    goto/16 :goto_1a

    :sswitch_31
    const-string v6, "V_VP9"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5e

    goto/16 :goto_19

    :cond_5e
    const/16 v15, 0x12

    goto/16 :goto_1a

    :sswitch_32
    const-string v6, "V_VP8"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5f

    goto/16 :goto_19

    :cond_5f
    const/16 v15, 0x11

    goto/16 :goto_1a

    :sswitch_33
    const-string v6, "V_AV1"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_60

    goto/16 :goto_19

    :cond_60
    const/16 v15, 0x10

    goto/16 :goto_1a

    :sswitch_34
    const-string v6, "A_DTS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_61

    goto/16 :goto_19

    :cond_61
    const/16 v15, 0xf

    goto/16 :goto_1a

    :sswitch_35
    const-string v6, "A_AC3"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_62

    goto/16 :goto_19

    :cond_62
    const/16 v15, 0xe

    goto/16 :goto_1a

    :sswitch_36
    const-string v6, "A_AAC"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_63

    goto/16 :goto_19

    :cond_63
    const/16 v15, 0xd

    goto/16 :goto_1a

    :sswitch_37
    const-string v6, "A_DTS/LOSSLESS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_64

    goto/16 :goto_19

    :cond_64
    const/16 v15, 0xc

    goto/16 :goto_1a

    :sswitch_38
    const-string v6, "S_VOBSUB"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_65

    goto/16 :goto_19

    :cond_65
    const/16 v15, 0xb

    goto/16 :goto_1a

    :sswitch_39
    const-string v6, "V_MPEG4/ISO/AVC"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_66

    goto/16 :goto_19

    :cond_66
    const/16 v15, 0xa

    goto/16 :goto_1a

    :sswitch_3a
    const-string v6, "V_MPEG4/ISO/ASP"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_67

    goto/16 :goto_19

    :cond_67
    const/16 v15, 0x9

    goto/16 :goto_1a

    :sswitch_3b
    const-string v6, "S_DVBSUB"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_68

    goto/16 :goto_19

    :cond_68
    move/from16 v15, v18

    goto :goto_1a

    :sswitch_3c
    const-string v6, "V_MS/VFW/FOURCC"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_69

    goto/16 :goto_19

    :cond_69
    const/4 v15, 0x7

    goto :goto_1a

    :sswitch_3d
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6a

    goto/16 :goto_19

    :cond_6a
    const/4 v15, 0x6

    goto :goto_1a

    :sswitch_3e
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6b

    goto/16 :goto_19

    :cond_6b
    const/4 v15, 0x5

    goto :goto_1a

    :sswitch_3f
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6c

    goto/16 :goto_19

    :cond_6c
    const/4 v15, 0x4

    goto :goto_1a

    :sswitch_40
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6d

    goto/16 :goto_19

    :cond_6d
    const/4 v15, 0x3

    goto :goto_1a

    :sswitch_41
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6e

    goto/16 :goto_19

    :cond_6e
    const/4 v15, 0x2

    goto :goto_1a

    :sswitch_42
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6f

    goto/16 :goto_19

    :cond_6f
    const/4 v15, 0x1

    goto :goto_1a

    :sswitch_43
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_70

    goto/16 :goto_19

    :cond_70
    const/4 v15, 0x0

    .line 118
    :goto_1a
    const-string v8, "application/dvbsubs"

    const-string v10, "application/vobsub"

    const-string v11, "application/pgs"

    const-string v12, "video/x-unknown"

    const-string v13, "text/x-ssa"

    const-string v14, "text/vtt"

    const-string v6, "application/x-subrip"

    move/from16 v32, v7

    const-string v7, ". Setting mimeType to audio/x-unknown"

    const-string v33, "audio/raw"

    const-string v37, "audio/x-unknown"

    move/from16 v38, v15

    const-string v15, "MatroskaExtractor"

    packed-switch v38, :pswitch_data_1

    const-string v0, "Unrecognized codec identifier."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 119
    :pswitch_1
    new-instance v4, Ljava/util/ArrayList;

    const/4 v7, 0x3

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    iget-object v7, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    invoke-static/range {v18 .. v18}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v7, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v7

    iget-wide v0, v3, Ldefpackage/mi2;->T:J

    invoke-virtual {v7, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 122
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    invoke-static/range {v18 .. v18}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-wide v1, v3, Ldefpackage/mi2;->U:J

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    .line 124
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    const-string v12, "audio/opus"

    const/16 v0, 0x1680

    move v1, v0

    :goto_1b
    const/4 v0, -0x1

    :goto_1c
    const/4 v2, 0x0

    goto/16 :goto_32

    .line 126
    :pswitch_2
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 127
    const-string v12, "audio/flac"

    :goto_1d
    move-object v4, v0

    :goto_1e
    const/4 v0, -0x1

    const/4 v1, -0x1

    goto :goto_1c

    .line 128
    :pswitch_3
    const-string v12, "audio/eac3"

    :goto_1f
    :pswitch_4
    const/4 v0, -0x1

    :goto_20
    const/4 v1, -0x1

    :goto_21
    const/4 v2, 0x0

    const/4 v4, 0x0

    goto/16 :goto_32

    .line 129
    :pswitch_5
    const-string v12, "video/mpeg2"

    goto :goto_1f

    :pswitch_6
    move-object v12, v6

    goto :goto_1f

    :pswitch_7
    move-object v12, v14

    goto :goto_1f

    .line 130
    :pswitch_8
    new-instance v0, Ldefpackage/be3;

    iget-object v1, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>([B)V

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 131
    invoke-static {v0, v4, v1}, Ldefpackage/zl1;->a(Ldefpackage/be3;ZLdefpackage/ss0;)Ldefpackage/zl1;

    move-result-object v0

    .line 132
    iget-object v1, v0, Ldefpackage/zl1;->a:Ljava/util/List;

    .line 133
    iget v2, v0, Ldefpackage/zl1;->b:I

    iput v2, v3, Ldefpackage/mi2;->c0:I

    .line 134
    iget-object v0, v0, Ldefpackage/zl1;->n:Ljava/lang/String;

    .line 135
    const-string v12, "video/hevc"

    :goto_22
    move-object v2, v0

    move-object v4, v1

    :goto_23
    const/4 v0, -0x1

    const/4 v1, -0x1

    goto/16 :goto_32

    .line 136
    :pswitch_9
    sget-object v0, Ldefpackage/ni2;->l0:[B

    .line 137
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1}, Ldefpackage/yw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object v0

    move-object v4, v0

    move-object v12, v13

    goto :goto_1e

    .line 138
    :pswitch_a
    iget v0, v3, Ldefpackage/mi2;->R:I

    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 139
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v0, v1}, Ldefpackage/f35;->C(ILjava/nio/ByteOrder;)I

    move-result v0

    if-nez v0, :cond_71

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported little endian PCM bit depth: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, Ldefpackage/mi2;->R:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    :goto_24
    move-object/from16 v12, v37

    goto :goto_1f

    :cond_71
    :goto_25
    move-object/from16 v12, v33

    goto :goto_20

    .line 141
    :pswitch_b
    iget v0, v3, Ldefpackage/mi2;->R:I

    move/from16 v1, v18

    if-ne v0, v1, :cond_72

    move-object/from16 v12, v33

    const/4 v0, 0x3

    goto :goto_20

    :cond_72
    const/16 v1, 0x10

    if-ne v0, v1, :cond_73

    const/high16 v0, 0x10000000

    goto :goto_25

    :cond_73
    const/16 v1, 0x18

    if-ne v0, v1, :cond_74

    const/high16 v0, 0x50000000

    goto :goto_25

    :cond_74
    const/16 v1, 0x20

    if-ne v0, v1, :cond_75

    const/high16 v0, 0x60000000

    goto :goto_25

    .line 142
    :cond_75
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported big endian PCM bit depth: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, Ldefpackage/mi2;->R:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_24

    .line 143
    :pswitch_c
    iget v0, v3, Ldefpackage/mi2;->R:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_76

    move-object/from16 v12, v33

    const/4 v0, 0x4

    goto/16 :goto_20

    .line 144
    :cond_76
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported floating point PCM bit depth: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, Ldefpackage/mi2;->R:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_24

    :pswitch_d
    move-object v12, v11

    goto/16 :goto_1f

    .line 145
    :pswitch_e
    iget-object v0, v3, Ldefpackage/mi2;->l:[B

    if-nez v0, :cond_77

    const/4 v0, 0x0

    goto :goto_26

    :cond_77
    invoke-static {v0}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object v0

    .line 146
    :goto_26
    const-string v12, "video/x-vnd.on2.vp9"

    goto/16 :goto_1d

    .line 147
    :pswitch_f
    const-string v12, "video/x-vnd.on2.vp8"

    goto/16 :goto_1f

    .line 148
    :pswitch_10
    iget-object v0, v3, Ldefpackage/mi2;->l:[B

    if-nez v0, :cond_78

    const/4 v0, 0x0

    goto :goto_27

    :cond_78
    invoke-static {v0}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object v0

    .line 149
    :goto_27
    const-string v12, "video/av01"

    goto/16 :goto_1d

    :pswitch_11
    const/4 v4, 0x1

    .line 150
    iput-boolean v4, v3, Ldefpackage/mi2;->W:Z

    .line 151
    const-string v12, "audio/vnd.dts"

    goto/16 :goto_1f

    .line 152
    :pswitch_12
    const-string v12, "audio/ac3"

    goto/16 :goto_1f

    .line 153
    :pswitch_13
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 154
    iget-object v1, v3, Ldefpackage/mi2;->l:[B

    .line 155
    new-instance v2, Ldefpackage/h00;

    .line 156
    array-length v4, v1

    invoke-direct {v2, v4, v1}, Ldefpackage/h00;-><init>(I[B)V

    const/4 v4, 0x0

    .line 157
    invoke-static {v2, v4}, Ldefpackage/xl;->D(Ldefpackage/h00;Z)Ldefpackage/g;

    move-result-object v1

    .line 158
    iget v2, v1, Ldefpackage/g;->b:I

    iput v2, v3, Ldefpackage/mi2;->S:I

    .line 159
    iget v2, v1, Ldefpackage/g;->c:I

    iput v2, v3, Ldefpackage/mi2;->Q:I

    .line 160
    iget-object v1, v1, Ldefpackage/g;->a:Ljava/lang/String;

    .line 161
    const-string v12, "audio/mp4a-latm"

    move-object v4, v0

    move-object v2, v1

    goto/16 :goto_23

    .line 162
    :pswitch_14
    const-string v12, "audio/vnd.dts.hd"

    goto/16 :goto_1f

    .line 163
    :pswitch_15
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object v0

    move-object v4, v0

    move-object v12, v10

    goto/16 :goto_1e

    .line 164
    :pswitch_16
    new-instance v0, Ldefpackage/be3;

    iget-object v1, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>([B)V

    invoke-static {v0}, Ldefpackage/yn;->a(Ldefpackage/be3;)Ldefpackage/yn;

    move-result-object v0

    .line 165
    iget-object v1, v0, Ldefpackage/yn;->a:Ljava/util/ArrayList;

    .line 166
    iget v2, v0, Ldefpackage/yn;->b:I

    iput v2, v3, Ldefpackage/mi2;->c0:I

    .line 167
    iget-object v0, v0, Ldefpackage/yn;->l:Ljava/lang/String;

    .line 168
    const-string v12, "video/avc"

    goto/16 :goto_22

    :pswitch_17
    const/4 v0, 0x4

    .line 169
    new-array v1, v0, [B

    .line 170
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 171
    invoke-static {v1}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    move-result-object v0

    move-object v4, v0

    move-object v12, v8

    goto/16 :goto_1e

    .line 172
    :pswitch_18
    new-instance v0, Ldefpackage/be3;

    iget-object v1, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 173
    invoke-virtual {v3, v1}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>([B)V

    const/16 v1, 0x10

    .line 174
    :try_start_0
    invoke-virtual {v0, v1}, Ldefpackage/be3;->O(I)V

    .line 175
    invoke-virtual {v0}, Ldefpackage/be3;->r()J

    move-result-wide v1

    const-wide/32 v17, 0x58564944

    cmp-long v4, v1, v17

    if-nez v4, :cond_79

    .line 176
    new-instance v0, Landroid/util/Pair;

    const-string v1, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v2, 0x0

    :try_start_1
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_28
    const/4 v1, 0x0

    goto/16 :goto_2a

    :catch_0
    move-object v1, v2

    goto/16 :goto_2b

    :catch_1
    const/4 v1, 0x0

    goto/16 :goto_2b

    :cond_79
    const-wide/32 v17, 0x33363248

    cmp-long v4, v1, v17

    if-nez v4, :cond_7a

    .line 177
    :try_start_2
    new-instance v0, Landroid/util/Pair;

    const-string v1, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v2, 0x0

    :try_start_3
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_28

    :cond_7a
    const-wide/32 v17, 0x31435657

    cmp-long v1, v1, v17

    if-nez v1, :cond_7e

    .line 178
    :try_start_4
    iget v1, v0, Ldefpackage/be3;->b:I

    const/16 v36, 0x14

    add-int/lit8 v1, v1, 0x14

    .line 179
    iget-object v0, v0, Ldefpackage/be3;->a:[B

    .line 180
    :goto_29
    array-length v2, v0

    const/16 v22, 0x4

    add-int/lit8 v2, v2, -0x4

    if-ge v1, v2, :cond_7d

    .line 181
    aget-byte v2, v0, v1

    if-nez v2, :cond_7b

    add-int/lit8 v2, v1, 0x1

    aget-byte v2, v0, v2

    if-nez v2, :cond_7b

    add-int/lit8 v2, v1, 0x2

    aget-byte v2, v0, v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_7b

    add-int/lit8 v2, v1, 0x3

    aget-byte v2, v0, v2

    const/16 v4, 0xf

    if-ne v2, v4, :cond_7c

    .line 182
    array-length v2, v0

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    .line 183
    new-instance v1, Landroid/util/Pair;

    const-string v2, "video/wvc1"

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_28

    :cond_7b
    const/16 v4, 0xf

    :cond_7c
    add-int/lit8 v1, v1, 0x1

    goto :goto_29

    .line 184
    :cond_7d
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1

    const/4 v1, 0x0

    :try_start_5
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1

    .line 185
    :cond_7e
    const-string v0, "Unknown FourCC. Setting mimeType to video/x-unknown"

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    new-instance v0, Landroid/util/Pair;

    const/4 v1, 0x0

    invoke-direct {v0, v12, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    :goto_2a
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    .line 188
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v26, v0

    check-cast v26, Ljava/util/List;

    move-object v2, v1

    move-object/from16 v4, v26

    goto/16 :goto_23

    .line 189
    :catch_2
    :goto_2b
    const-string v0, "Error parsing FourCC private data"

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 190
    :pswitch_19
    const-string v12, "audio/mpeg"

    :goto_2c
    const/4 v0, -0x1

    const/16 v1, 0x1000

    goto/16 :goto_21

    .line 191
    :pswitch_1a
    const-string v12, "audio/mpeg-L2"

    goto :goto_2c

    .line 192
    :pswitch_1b
    invoke-virtual {v3, v4}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 193
    const-string v1, "Error parsing vorbis codec private"

    const/16 v34, 0x0

    :try_start_7
    aget-byte v2, v0, v34

    const/4 v4, 0x2

    if-ne v2, v4, :cond_84

    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 194
    :goto_2d
    aget-byte v7, v0, v4

    const/16 v12, 0xff

    and-int/2addr v7, v12

    if-ne v7, v12, :cond_7f

    add-int/lit16 v2, v2, 0xff

    add-int/lit8 v4, v4, 0x1

    goto :goto_2d

    :cond_7f
    add-int/lit8 v4, v4, 0x1

    add-int/2addr v2, v7

    const/4 v7, 0x0

    .line 195
    :goto_2e
    aget-byte v15, v0, v4

    and-int/2addr v15, v12

    if-ne v15, v12, :cond_80

    add-int/lit16 v7, v7, 0xff

    add-int/lit8 v4, v4, 0x1

    goto :goto_2e

    :cond_80
    add-int/lit8 v4, v4, 0x1

    add-int/2addr v7, v15

    .line 196
    aget-byte v12, v0, v4

    const/4 v15, 0x1

    if-ne v12, v15, :cond_83

    .line 197
    new-array v12, v2, [B

    const/4 v15, 0x0

    .line 198
    invoke-static {v0, v4, v12, v15, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v2

    .line 199
    aget-byte v2, v0, v4

    const/4 v15, 0x3

    if-ne v2, v15, :cond_82

    add-int/2addr v4, v7

    .line 200
    aget-byte v2, v0, v4

    const/4 v15, 0x5

    if-ne v2, v15, :cond_81

    .line 201
    array-length v2, v0

    sub-int/2addr v2, v4

    new-array v2, v2, [B

    .line 202
    array-length v7, v0

    sub-int/2addr v7, v4

    const/4 v15, 0x0

    invoke-static {v0, v4, v2, v15, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    new-instance v0, Ljava/util/ArrayList;

    const/4 v4, 0x2

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 206
    const-string v12, "audio/vorbis"

    const/16 v1, 0x2000

    move-object v4, v0

    goto/16 :goto_1b

    :catch_3
    const/4 v2, 0x0

    goto :goto_2f

    :cond_81
    const/4 v2, 0x0

    .line 207
    :try_start_8
    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_82
    const/4 v2, 0x0

    .line 208
    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_83
    const/4 v2, 0x0

    .line 209
    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_84
    const/4 v2, 0x0

    .line 210
    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 211
    :catch_4
    :goto_2f
    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 212
    :pswitch_1c
    new-instance v0, Ldefpackage/my4;

    invoke-direct {v0}, Ldefpackage/my4;-><init>()V

    iput-object v0, v3, Ldefpackage/mi2;->V:Ldefpackage/my4;

    .line 213
    const-string v12, "audio/true-hd"

    goto/16 :goto_1f

    .line 214
    :pswitch_1d
    new-instance v0, Ldefpackage/be3;

    iget-object v1, v3, Ldefpackage/mi2;->c:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ldefpackage/mi2;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ldefpackage/be3;-><init>([B)V

    .line 215
    :try_start_9
    invoke-virtual {v0}, Ldefpackage/be3;->t()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_85

    goto :goto_30

    :cond_85
    const v2, 0xfffe

    if-ne v1, v2, :cond_86

    const/16 v1, 0x18

    .line 216
    invoke-virtual {v0, v1}, Ldefpackage/be3;->N(I)V

    .line 217
    invoke-virtual {v0}, Ldefpackage/be3;->u()J

    move-result-wide v1

    .line 218
    sget-object v4, Ldefpackage/ni2;->o0:Ljava/util/UUID;

    .line 219
    invoke-virtual {v4}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v16

    cmp-long v1, v1, v16

    if-nez v1, :cond_86

    .line 220
    invoke-virtual {v0}, Ldefpackage/be3;->u()J

    move-result-wide v0

    invoke-virtual {v4}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v16
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_5

    cmp-long v0, v0, v16

    if-nez v0, :cond_86

    .line 221
    :goto_30
    iget v0, v3, Ldefpackage/mi2;->R:I

    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 222
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v0, v1}, Ldefpackage/f35;->C(ILjava/nio/ByteOrder;)I

    move-result v0

    if-nez v0, :cond_71

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported PCM bit depth: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, Ldefpackage/mi2;->R:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_24

    .line 224
    :cond_86
    const-string v0, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    invoke-static {v15, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_24

    .line 225
    :catch_5
    const-string v0, "Error parsing MS/ACM codec private"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 226
    :pswitch_1e
    iget-object v0, v3, Ldefpackage/mi2;->l:[B

    if-nez v0, :cond_87

    const/4 v0, 0x0

    goto :goto_31

    :cond_87
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 227
    :goto_31
    const-string v12, "video/mp4v-es"

    goto/16 :goto_1d

    .line 228
    :goto_32
    iget-object v7, v3, Ldefpackage/mi2;->P:[B

    if-eqz v7, :cond_88

    .line 229
    new-instance v7, Ldefpackage/be3;

    iget-object v15, v3, Ldefpackage/mi2;->P:[B

    invoke-direct {v7, v15}, Ldefpackage/be3;-><init>([B)V

    .line 230
    invoke-static {v7}, Ldefpackage/zh0;->E(Ldefpackage/be3;)Ldefpackage/zh0;

    move-result-object v7

    if-eqz v7, :cond_88

    .line 231
    iget-object v2, v7, Ldefpackage/zh0;->o:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .line 232
    const-string v12, "video/dolby-vision"

    .line 233
    :cond_88
    iget-boolean v7, v3, Ldefpackage/mi2;->Y:Z

    .line 234
    iget-boolean v15, v3, Ldefpackage/mi2;->X:Z

    if-eqz v15, :cond_89

    const/16 v25, 0x2

    goto :goto_33

    :cond_89
    const/16 v25, 0x0

    :goto_33
    or-int v7, v7, v25

    .line 235
    new-instance v15, Ldefpackage/sb1;

    invoke-direct {v15}, Ldefpackage/sb1;-><init>()V

    .line 236
    invoke-static {v12}, Ldefpackage/lw2;->i(Ljava/lang/String;)Z

    move-result v16

    move-object/from16 v19, v9

    sget-object v9, Ldefpackage/ni2;->p0:Ljava/util/Map;

    if-eqz v16, :cond_8a

    .line 237
    iget v6, v3, Ldefpackage/mi2;->Q:I

    .line 238
    iput v6, v15, Ldefpackage/sb1;->E:I

    .line 239
    iget v6, v3, Ldefpackage/mi2;->S:I

    .line 240
    iput v6, v15, Ldefpackage/sb1;->F:I

    .line 241
    iput v0, v15, Ldefpackage/sb1;->G:I

    goto/16 :goto_3c

    .line 242
    :cond_8a
    invoke-static {v12}, Ldefpackage/lw2;->l(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_98

    .line 243
    iget v0, v3, Ldefpackage/mi2;->s:I

    if-nez v0, :cond_8d

    .line 244
    iget v0, v3, Ldefpackage/mi2;->q:I

    const/4 v13, -0x1

    if-ne v0, v13, :cond_8b

    iget v0, v3, Ldefpackage/mi2;->n:I

    :cond_8b
    iput v0, v3, Ldefpackage/mi2;->q:I

    .line 245
    iget v0, v3, Ldefpackage/mi2;->r:I

    if-ne v0, v13, :cond_8c

    iget v0, v3, Ldefpackage/mi2;->o:I

    :cond_8c
    iput v0, v3, Ldefpackage/mi2;->r:I

    goto :goto_34

    :cond_8d
    const/4 v13, -0x1

    .line 246
    :goto_34
    iget v0, v3, Ldefpackage/mi2;->q:I

    const/high16 v6, -0x40800000    # -1.0f

    if-eq v0, v13, :cond_8e

    iget v8, v3, Ldefpackage/mi2;->r:I

    if-eq v8, v13, :cond_8e

    .line 247
    iget v10, v3, Ldefpackage/mi2;->o:I

    mul-int/2addr v10, v0

    int-to-float v0, v10

    iget v10, v3, Ldefpackage/mi2;->n:I

    mul-int/2addr v10, v8

    int-to-float v8, v10

    div-float/2addr v0, v8

    goto :goto_35

    :cond_8e
    move v0, v6

    .line 248
    :goto_35
    iget-boolean v8, v3, Ldefpackage/mi2;->z:Z

    if-eqz v8, :cond_91

    .line 249
    iget v8, v3, Ldefpackage/mi2;->F:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->G:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->H:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->I:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->J:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->K:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->L:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->M:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->N:F

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_90

    iget v8, v3, Ldefpackage/mi2;->O:F

    cmpl-float v6, v8, v6

    if-nez v6, :cond_8f

    goto/16 :goto_36

    :cond_8f
    const/16 v6, 0x19

    .line 250
    new-array v6, v6, [B

    .line 251
    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v8

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v8

    const/4 v10, 0x0

    .line 252
    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 253
    iget v10, v3, Ldefpackage/mi2;->F:F

    const v11, 0x47435000    # 50000.0f

    mul-float/2addr v10, v11

    const/high16 v13, 0x3f000000    # 0.5f

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 254
    iget v10, v3, Ldefpackage/mi2;->G:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 255
    iget v10, v3, Ldefpackage/mi2;->H:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 256
    iget v10, v3, Ldefpackage/mi2;->I:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 257
    iget v10, v3, Ldefpackage/mi2;->J:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 258
    iget v10, v3, Ldefpackage/mi2;->K:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 259
    iget v10, v3, Ldefpackage/mi2;->L:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 260
    iget v10, v3, Ldefpackage/mi2;->M:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 261
    iget v10, v3, Ldefpackage/mi2;->N:F

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 262
    iget v10, v3, Ldefpackage/mi2;->O:F

    add-float/2addr v10, v13

    float-to-int v10, v10

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 263
    iget v10, v3, Ldefpackage/mi2;->D:I

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 264
    iget v10, v3, Ldefpackage/mi2;->E:I

    int-to-short v10, v10

    invoke-virtual {v8, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v40, v6

    goto :goto_37

    :cond_90
    :goto_36
    const/16 v40, 0x0

    .line 265
    :goto_37
    iget v6, v3, Ldefpackage/mi2;->A:I

    .line 266
    iget v8, v3, Ldefpackage/mi2;->C:I

    .line 267
    iget v10, v3, Ldefpackage/mi2;->B:I

    .line 268
    iget v11, v3, Ldefpackage/mi2;->p:I

    .line 269
    new-instance v36, Ldefpackage/c50;

    move/from16 v42, v11

    move/from16 v37, v6

    move/from16 v38, v8

    move/from16 v39, v10

    move/from16 v41, v11

    .line 270
    invoke-direct/range {v36 .. v42}, Ldefpackage/c50;-><init>(III[BII)V

    move-object/from16 v6, v36

    goto :goto_38

    :cond_91
    const/4 v6, 0x0

    .line 271
    :goto_38
    iget-object v8, v3, Ldefpackage/mi2;->b:Ljava/lang/String;

    if-eqz v8, :cond_92

    invoke-interface {v9, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_92

    .line 272
    iget-object v8, v3, Ldefpackage/mi2;->b:Ljava/lang/String;

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_39

    :cond_92
    const/4 v8, -0x1

    .line 273
    :goto_39
    iget v10, v3, Ldefpackage/mi2;->t:I

    if-nez v10, :cond_97

    iget v10, v3, Ldefpackage/mi2;->u:F

    const/4 v11, 0x0

    .line 274
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_97

    iget v10, v3, Ldefpackage/mi2;->v:F

    .line 275
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_97

    .line 276
    iget v10, v3, Ldefpackage/mi2;->w:F

    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_93

    const/4 v8, 0x0

    goto :goto_3b

    .line 277
    :cond_93
    iget v10, v3, Ldefpackage/mi2;->w:F

    const/high16 v11, 0x42b40000    # 90.0f

    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_94

    const/16 v8, 0x5a

    goto :goto_3b

    .line 278
    :cond_94
    iget v10, v3, Ldefpackage/mi2;->w:F

    const/high16 v11, -0x3ccc0000    # -180.0f

    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-eqz v10, :cond_96

    iget v10, v3, Ldefpackage/mi2;->w:F

    const/high16 v11, 0x43340000    # 180.0f

    .line 279
    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_95

    goto :goto_3a

    .line 280
    :cond_95
    iget v10, v3, Ldefpackage/mi2;->w:F

    const/high16 v11, -0x3d4c0000    # -90.0f

    invoke-static {v10, v11}, Ljava/lang/Float;->compare(FF)I

    move-result v10

    if-nez v10, :cond_97

    const/16 v8, 0x10e

    goto :goto_3b

    :cond_96
    :goto_3a
    const/16 v8, 0xb4

    .line 281
    :cond_97
    :goto_3b
    iget v10, v3, Ldefpackage/mi2;->n:I

    .line 282
    iput v10, v15, Ldefpackage/sb1;->t:I

    .line 283
    iget v10, v3, Ldefpackage/mi2;->o:I

    .line 284
    iput v10, v15, Ldefpackage/sb1;->u:I

    .line 285
    iput v0, v15, Ldefpackage/sb1;->z:F

    .line 286
    iput v8, v15, Ldefpackage/sb1;->y:I

    .line 287
    iget-object v0, v3, Ldefpackage/mi2;->x:[B

    .line 288
    iput-object v0, v15, Ldefpackage/sb1;->A:[B

    .line 289
    iget v0, v3, Ldefpackage/mi2;->y:I

    .line 290
    iput v0, v15, Ldefpackage/sb1;->B:I

    .line 291
    iput-object v6, v15, Ldefpackage/sb1;->C:Ldefpackage/c50;

    goto :goto_3c

    .line 292
    :cond_98
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    .line 293
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    .line 294
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    .line 295
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    .line 296
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    .line 297
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_99

    goto :goto_3c

    .line 298
    :cond_99
    const-string v0, "Unexpected MIME type."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 299
    :cond_9a
    :goto_3c
    iget-object v0, v3, Ldefpackage/mi2;->b:Ljava/lang/String;

    if-eqz v0, :cond_9b

    invoke-interface {v9, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9b

    .line 300
    iget-object v0, v3, Ldefpackage/mi2;->b:Ljava/lang/String;

    .line 301
    iput-object v0, v15, Ldefpackage/sb1;->b:Ljava/lang/String;

    .line 302
    :cond_9b
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 303
    iget-boolean v0, v3, Ldefpackage/mi2;->a:Z

    if-eqz v0, :cond_9c

    move-object/from16 v6, v27

    goto :goto_3d

    :cond_9c
    const-string v6, "video/x-matroska"

    .line 304
    :goto_3d
    invoke-static {v6}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Ldefpackage/sb1;->l:Ljava/lang/String;

    .line 305
    invoke-static {v12}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 306
    iput v1, v15, Ldefpackage/sb1;->n:I

    .line 307
    iget-object v0, v3, Ldefpackage/mi2;->Z:Ljava/lang/String;

    .line 308
    iput-object v0, v15, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 309
    iput v7, v15, Ldefpackage/sb1;->e:I

    .line 310
    iput-object v4, v15, Ldefpackage/sb1;->p:Ljava/util/List;

    .line 311
    iput-object v2, v15, Ldefpackage/sb1;->j:Ljava/lang/String;

    .line 312
    iget-object v0, v3, Ldefpackage/mi2;->m:Ldefpackage/ow0;

    .line 313
    iput-object v0, v15, Ldefpackage/sb1;->q:Ldefpackage/ow0;

    .line 314
    invoke-virtual {v15}, Ldefpackage/sb1;->a()Ldefpackage/tb1;

    move-result-object v0

    iput-object v0, v3, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 315
    iget-object v0, v5, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    iget v1, v3, Ldefpackage/mi2;->d:I

    iget v2, v3, Ldefpackage/mi2;->e:I

    invoke-interface {v0, v1, v2}, Ldefpackage/m51;->t(II)Ldefpackage/wv4;

    move-result-object v0

    iput-object v0, v3, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 316
    iget v0, v3, Ldefpackage/mi2;->d:I

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_18

    .line 317
    :goto_3e
    iput-object v1, v5, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    goto/16 :goto_15

    :cond_9d
    const/4 v1, 0x0

    .line 318
    const-string v0, "CodecId is missing in TrackEntry element"

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_9e
    move-object v1, v9

    .line 319
    iget v0, v5, Ldefpackage/ni2;->O:I

    const/4 v4, 0x2

    if-eq v0, v4, :cond_9f

    :goto_3f
    goto/16 :goto_15

    .line 320
    :cond_9f
    iget v0, v5, Ldefpackage/ni2;->U:I

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldefpackage/mi2;

    .line 321
    iget-object v1, v0, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    iget-wide v1, v5, Ldefpackage/ni2;->Z:J

    cmp-long v1, v1, v16

    if-lez v1, :cond_a0

    iget-object v1, v0, Ldefpackage/mi2;->c:Ljava/lang/String;

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a0

    .line 324
    iget-object v1, v5, Ldefpackage/ni2;->p:Ldefpackage/be3;

    const/16 v18, 0x8

    .line 325
    invoke-static/range {v18 .. v18}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 326
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget-wide v3, v5, Ldefpackage/ni2;->Z:J

    .line 327
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 328
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    array-length v3, v2

    invoke-virtual {v1, v3, v2}, Ldefpackage/be3;->L(I[B)V

    :cond_a0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 331
    :goto_40
    iget v3, v5, Ldefpackage/ni2;->S:I

    if-ge v1, v3, :cond_a1

    .line 332
    iget-object v3, v5, Ldefpackage/ni2;->T:[I

    aget v3, v3, v1

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_40

    :cond_a1
    const/4 v1, 0x0

    .line 333
    :goto_41
    iget v3, v5, Ldefpackage/ni2;->S:I

    if-ge v1, v3, :cond_a3

    .line 334
    iget-wide v3, v5, Ldefpackage/ni2;->P:J

    iget v6, v0, Ldefpackage/mi2;->f:I

    mul-int/2addr v6, v1

    div-int/lit16 v6, v6, 0x3e8

    int-to-long v6, v6

    add-long v29, v3, v6

    .line 335
    iget v3, v5, Ldefpackage/ni2;->W:I

    if-nez v1, :cond_a2

    .line 336
    iget-boolean v4, v5, Ldefpackage/ni2;->Y:Z

    if-nez v4, :cond_a2

    or-int/lit8 v3, v3, 0x1

    :cond_a2
    move/from16 v31, v3

    .line 337
    iget-object v3, v5, Ldefpackage/ni2;->T:[I

    aget v32, v3, v1

    sub-int v33, v2, v32

    move-object/from16 v28, v0

    move-object/from16 v27, v5

    .line 338
    invoke-virtual/range {v27 .. v33}, Ldefpackage/ni2;->i(Ldefpackage/mi2;JIII)V

    add-int/lit8 v1, v1, 0x1

    move/from16 v2, v33

    goto :goto_41

    :cond_a3
    const/4 v4, 0x0

    .line 339
    iput v4, v5, Ldefpackage/ni2;->O:I

    :goto_42
    move-object/from16 v1, p1

    :goto_43
    const/4 v5, 0x1

    goto/16 :goto_53

    :cond_a4
    move v4, v3

    .line 340
    iget v0, v7, Ldefpackage/mk0;->e:I

    move-object/from16 v1, p1

    if-nez v0, :cond_ab

    const/4 v0, 0x4

    const/4 v2, 0x1

    .line 341
    invoke-virtual {v8, v1, v2, v4, v0}, Ldefpackage/k35;->b(Ldefpackage/l51;ZZI)J

    move-result-wide v5

    const-wide/16 v2, -0x2

    cmp-long v2, v5, v2

    if-nez v2, :cond_a9

    .line 342
    iget-object v2, v7, Ldefpackage/mk0;->a:[B

    invoke-interface {v1}, Ldefpackage/l51;->k()V

    .line 343
    :goto_44
    invoke-interface {v1, v2, v4, v0}, Ldefpackage/l51;->n([BII)V

    .line 344
    aget-byte v0, v2, v4

    const/4 v3, 0x0

    :goto_45
    const/16 v4, 0x8

    if-ge v3, v4, :cond_a6

    .line 345
    sget-object v4, Ldefpackage/k35;->d:[J

    aget-wide v5, v4, v3

    int-to-long v10, v0

    and-long v4, v5, v10

    cmp-long v4, v4, v16

    if-eqz v4, :cond_a5

    add-int/lit8 v0, v3, 0x1

    move v4, v0

    :goto_46
    const/4 v0, -0x1

    goto :goto_47

    :cond_a5
    add-int/lit8 v3, v3, 0x1

    goto :goto_45

    :cond_a6
    const/4 v4, -0x1

    goto :goto_46

    :goto_47
    if-eq v4, v0, :cond_a7

    const/4 v0, 0x4

    if-gt v4, v0, :cond_a7

    const/4 v10, 0x0

    .line 346
    invoke-static {v4, v10, v2}, Ldefpackage/k35;->a(IZ[B)J

    move-result-wide v5

    long-to-int v0, v5

    .line 347
    iget-object v3, v7, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    .line 348
    iget-object v3, v3, Ldefpackage/hg3;->o:Ljava/lang/Object;

    if-eq v0, v13, :cond_a8

    const v3, 0x1f43b675

    if-eq v0, v3, :cond_a8

    if-eq v0, v14, :cond_a8

    if-ne v0, v15, :cond_a7

    goto :goto_48

    :cond_a7
    const/4 v4, 0x1

    goto :goto_49

    .line 349
    :cond_a8
    :goto_48
    invoke-interface {v1, v4}, Ldefpackage/l51;->l(I)V

    int-to-long v5, v0

    :cond_a9
    const/4 v4, 0x1

    goto :goto_4a

    .line 350
    :goto_49
    invoke-interface {v1, v4}, Ldefpackage/l51;->l(I)V

    const/4 v0, 0x4

    const/4 v4, 0x0

    goto :goto_44

    :goto_4a
    cmp-long v0, v5, v20

    if-nez v0, :cond_aa

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto/16 :goto_53

    :cond_aa
    long-to-int v0, v5

    .line 351
    iput v0, v7, Ldefpackage/mk0;->f:I

    .line 352
    iput v4, v7, Ldefpackage/mk0;->e:I

    goto :goto_4b

    :cond_ab
    const/4 v4, 0x1

    .line 353
    :goto_4b
    iget v0, v7, Ldefpackage/mk0;->e:I

    if-ne v0, v4, :cond_ac

    const/16 v0, 0x8

    const/4 v15, 0x0

    .line 354
    invoke-virtual {v8, v1, v15, v4, v0}, Ldefpackage/k35;->b(Ldefpackage/l51;ZZI)J

    move-result-wide v2

    iput-wide v2, v7, Ldefpackage/mk0;->g:J

    const/4 v4, 0x2

    .line 355
    iput v4, v7, Ldefpackage/mk0;->e:I

    .line 356
    :cond_ac
    iget-object v0, v7, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    iget v2, v7, Ldefpackage/mk0;->f:I

    .line 357
    iget-object v3, v0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    sparse-switch v2, :sswitch_data_2

    const/4 v3, 0x0

    goto :goto_4c

    :sswitch_44
    const/4 v3, 0x5

    goto :goto_4c

    :sswitch_45
    const/4 v3, 0x4

    goto :goto_4c

    :sswitch_46
    const/4 v3, 0x1

    goto :goto_4c

    :sswitch_47
    const/4 v3, 0x3

    goto :goto_4c

    :sswitch_48
    const/4 v3, 0x2

    :goto_4c
    if-eqz v3, :cond_be

    const/4 v4, 0x1

    if-eq v3, v4, :cond_ba

    const-wide/16 v4, 0x8

    const/4 v13, 0x2

    if-eq v3, v13, :cond_b8

    const/4 v15, 0x3

    if-eq v3, v15, :cond_b4

    const/4 v6, 0x4

    if-eq v3, v6, :cond_b3

    const/4 v15, 0x5

    if-ne v3, v15, :cond_b2

    .line 358
    iget-wide v8, v7, Ldefpackage/mk0;->g:J

    const-wide/16 v10, 0x4

    cmp-long v3, v8, v10

    if-eqz v3, :cond_ae

    cmp-long v3, v8, v4

    if-nez v3, :cond_ad

    goto :goto_4d

    .line 359
    :cond_ad
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid float size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v7, Ldefpackage/mk0;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_ae
    :goto_4d
    long-to-int v3, v8

    .line 360
    invoke-virtual {v7, v1, v3}, Ldefpackage/mk0;->a(Ldefpackage/l51;I)J

    move-result-wide v4

    const/4 v6, 0x4

    if-ne v3, v6, :cond_af

    long-to-int v3, v4

    .line 361
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    float-to-double v3, v3

    goto :goto_4e

    .line 362
    :cond_af
    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    .line 363
    :goto_4e
    iget-object v0, v0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    check-cast v0, Ldefpackage/ni2;

    const/16 v5, 0xb5

    if-eq v2, v5, :cond_b1

    const/16 v5, 0x4489

    if-eq v2, v5, :cond_b0

    packed-switch v2, :pswitch_data_2

    packed-switch v2, :pswitch_data_3

    :goto_4f
    const/4 v4, 0x0

    goto/16 :goto_50

    .line 364
    :pswitch_1f
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 365
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 366
    iput v2, v0, Ldefpackage/mi2;->w:F

    goto :goto_4f

    .line 367
    :pswitch_20
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 368
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 369
    iput v2, v0, Ldefpackage/mi2;->v:F

    goto :goto_4f

    .line 370
    :pswitch_21
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 371
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 372
    iput v2, v0, Ldefpackage/mi2;->u:F

    goto :goto_4f

    .line 373
    :pswitch_22
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 374
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 375
    iput v2, v0, Ldefpackage/mi2;->O:F

    goto :goto_4f

    .line 376
    :pswitch_23
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 377
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 378
    iput v2, v0, Ldefpackage/mi2;->N:F

    goto :goto_4f

    .line 379
    :pswitch_24
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 380
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 381
    iput v2, v0, Ldefpackage/mi2;->M:F

    goto :goto_4f

    .line 382
    :pswitch_25
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 383
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 384
    iput v2, v0, Ldefpackage/mi2;->L:F

    goto :goto_4f

    .line 385
    :pswitch_26
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 386
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 387
    iput v2, v0, Ldefpackage/mi2;->K:F

    goto :goto_4f

    .line 388
    :pswitch_27
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 389
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 390
    iput v2, v0, Ldefpackage/mi2;->J:F

    goto :goto_4f

    .line 391
    :pswitch_28
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 392
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 393
    iput v2, v0, Ldefpackage/mi2;->I:F

    goto :goto_4f

    .line 394
    :pswitch_29
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 395
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 396
    iput v2, v0, Ldefpackage/mi2;->H:F

    goto :goto_4f

    .line 397
    :pswitch_2a
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 398
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 399
    iput v2, v0, Ldefpackage/mi2;->G:F

    goto :goto_4f

    .line 400
    :pswitch_2b
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 401
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-float v2, v3

    .line 402
    iput v2, v0, Ldefpackage/mi2;->F:F

    goto :goto_4f

    :cond_b0
    double-to-long v2, v3

    .line 403
    iput-wide v2, v0, Ldefpackage/ni2;->u:J

    goto :goto_4f

    .line 404
    :cond_b1
    invoke-virtual {v0, v2}, Ldefpackage/ni2;->h(I)V

    .line 405
    iget-object v0, v0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    double-to-int v2, v3

    .line 406
    iput v2, v0, Ldefpackage/mi2;->S:I

    goto/16 :goto_4f

    .line 407
    :goto_50
    iput v4, v7, Ldefpackage/mk0;->e:I

    goto/16 :goto_43

    .line 408
    :cond_b2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid element type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 409
    :cond_b3
    iget-wide v3, v7, Ldefpackage/mk0;->g:J

    long-to-int v3, v3

    invoke-virtual {v0, v2, v3, v1}, Ldefpackage/hg3;->B(IILdefpackage/l51;)V

    const/4 v4, 0x0

    .line 410
    iput v4, v7, Ldefpackage/mk0;->e:I

    goto/16 :goto_43

    :cond_b4
    const/4 v4, 0x0

    .line 411
    iget-wide v5, v7, Ldefpackage/mk0;->g:J

    const-wide/32 v8, 0x7fffffff

    cmp-long v3, v5, v8

    if-gtz v3, :cond_b7

    long-to-int v3, v5

    if-nez v3, :cond_b5

    .line 412
    const-string v3, ""

    move v15, v4

    goto :goto_52

    .line 413
    :cond_b5
    new-array v5, v3, [B

    .line 414
    invoke-interface {v1, v5, v4, v3}, Ldefpackage/l51;->readFully([BII)V

    :goto_51
    if-lez v3, :cond_b6

    add-int/lit8 v4, v3, -0x1

    .line 415
    aget-byte v4, v5, v4

    if-nez v4, :cond_b6

    add-int/lit8 v3, v3, -0x1

    goto :goto_51

    .line 416
    :cond_b6
    new-instance v4, Ljava/lang/String;

    const/4 v15, 0x0

    invoke-direct {v4, v5, v15, v3}, Ljava/lang/String;-><init>([BII)V

    move-object v3, v4

    .line 417
    :goto_52
    invoke-virtual {v0, v2, v3}, Ldefpackage/hg3;->J(ILjava/lang/String;)V

    .line 418
    iput v15, v7, Ldefpackage/mk0;->e:I

    move v4, v15

    goto/16 :goto_43

    .line 419
    :cond_b7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "String element size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v7, Ldefpackage/mk0;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 420
    :cond_b8
    iget-wide v8, v7, Ldefpackage/mk0;->g:J

    cmp-long v3, v8, v4

    if-gtz v3, :cond_b9

    long-to-int v3, v8

    .line 421
    invoke-virtual {v7, v1, v3}, Ldefpackage/mk0;->a(Ldefpackage/l51;I)J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Ldefpackage/hg3;->F(IJ)V

    const/4 v4, 0x0

    .line 422
    iput v4, v7, Ldefpackage/mk0;->e:I

    goto/16 :goto_43

    .line 423
    :cond_b9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid integer size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v7, Ldefpackage/mk0;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    .line 424
    :cond_ba
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    move-result-wide v10

    .line 425
    iget-wide v2, v7, Ldefpackage/mk0;->g:J

    add-long/2addr v2, v10

    .line 426
    new-instance v0, Ldefpackage/lk0;

    iget v4, v7, Ldefpackage/mk0;->f:I

    invoke-direct {v0, v4, v2, v3}, Ldefpackage/lk0;-><init>(IJ)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 427
    iget-object v8, v7, Ldefpackage/mk0;->d:Ldefpackage/hg3;

    iget v9, v7, Ldefpackage/mk0;->f:I

    iget-wide v12, v7, Ldefpackage/mk0;->g:J

    invoke-virtual/range {v8 .. v13}, Ldefpackage/hg3;->I(IJJ)V

    const/4 v4, 0x0

    .line 428
    iput v4, v7, Ldefpackage/mk0;->e:I

    goto/16 :goto_43

    :goto_53
    if-eqz v5, :cond_bc

    .line 429
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    move-result-wide v2

    move-object/from16 v0, p0

    .line 430
    iget-boolean v6, v0, Ldefpackage/ni2;->J:Z

    if-eqz v6, :cond_bb

    .line 431
    iput-wide v2, v0, Ldefpackage/ni2;->L:J

    .line 432
    iget-wide v1, v0, Ldefpackage/ni2;->K:J

    move-object/from16 v3, p2

    iput-wide v1, v3, Ldefpackage/t71;->a:J

    .line 433
    iput-boolean v4, v0, Ldefpackage/ni2;->J:Z

    const/16 v35, 0x1

    return v35

    :cond_bb
    move-object/from16 v3, p2

    const/16 v35, 0x1

    .line 434
    iget-boolean v2, v0, Ldefpackage/ni2;->z:Z

    if-eqz v2, :cond_bd

    iget-wide v6, v0, Ldefpackage/ni2;->L:J

    cmp-long v2, v6, v20

    if-eqz v2, :cond_bd

    .line 435
    iput-wide v6, v3, Ldefpackage/t71;->a:J

    move-wide/from16 v1, v20

    .line 436
    iput-wide v1, v0, Ldefpackage/ni2;->L:J

    return v35

    :cond_bc
    const/16 v35, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    :cond_bd
    move/from16 v4, v35

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_be
    move-object/from16 v0, p0

    move-object/from16 v3, p2

    const/16 v35, 0x1

    .line 437
    iget-wide v4, v7, Ldefpackage/mk0;->g:J

    long-to-int v2, v4

    invoke-interface {v1, v2}, Ldefpackage/l51;->l(I)V

    const/4 v4, 0x0

    .line 438
    iput v4, v7, Ldefpackage/mk0;->e:I

    move v3, v4

    move/from16 v4, v35

    goto/16 :goto_1

    :cond_bf
    if-nez v5, :cond_c2

    const/4 v3, 0x0

    .line 439
    :goto_54
    iget-object v1, v0, Ldefpackage/ni2;->c:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v3, v2, :cond_c1

    .line 440
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldefpackage/mi2;

    .line 441
    iget-object v2, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 442
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    iget-object v2, v1, Ldefpackage/mi2;->V:Ldefpackage/my4;

    if-eqz v2, :cond_c0

    .line 444
    iget-object v4, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    iget-object v1, v1, Ldefpackage/mi2;->k:Ldefpackage/vv4;

    invoke-virtual {v2, v4, v1}, Ldefpackage/my4;->a(Ldefpackage/wv4;Ldefpackage/vv4;)V

    :cond_c0
    add-int/lit8 v3, v3, 0x1

    goto :goto_54

    :cond_c1
    const/16 v24, -0x1

    return v24

    :cond_c2
    const/16 v34, 0x0

    return v34

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_21
        -0x7ce7f3b0 -> :sswitch_20
        -0x76567dc0 -> :sswitch_1f
        -0x6a615338 -> :sswitch_1e
        -0x672350af -> :sswitch_1d
        -0x585f4fce -> :sswitch_1c
        -0x585f4fcd -> :sswitch_1b
        -0x51dc40b2 -> :sswitch_1a
        -0x37a9c464 -> :sswitch_19
        -0x2016c535 -> :sswitch_18
        -0x2016c4e5 -> :sswitch_17
        -0x19552dbd -> :sswitch_16
        -0x1538b2ba -> :sswitch_15
        0x3c02325 -> :sswitch_14
        0x3c02353 -> :sswitch_13
        0x3c030c5 -> :sswitch_12
        0x4e81333 -> :sswitch_11
        0x4e86155 -> :sswitch_10
        0x4e86156 -> :sswitch_f
        0x5e8da3e -> :sswitch_e
        0x1a8350d6 -> :sswitch_d
        0x2056f406 -> :sswitch_c
        0x25e26ee2 -> :sswitch_b
        0x2b45174d -> :sswitch_a
        0x2b453ce4 -> :sswitch_9
        0x2c0618eb -> :sswitch_8
        0x2c065c6b -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_43
        -0x7ce7f3b0 -> :sswitch_42
        -0x76567dc0 -> :sswitch_41
        -0x6a615338 -> :sswitch_40
        -0x672350af -> :sswitch_3f
        -0x585f4fce -> :sswitch_3e
        -0x585f4fcd -> :sswitch_3d
        -0x51dc40b2 -> :sswitch_3c
        -0x37a9c464 -> :sswitch_3b
        -0x2016c535 -> :sswitch_3a
        -0x2016c4e5 -> :sswitch_39
        -0x19552dbd -> :sswitch_38
        -0x1538b2ba -> :sswitch_37
        0x3c02325 -> :sswitch_36
        0x3c02353 -> :sswitch_35
        0x3c030c5 -> :sswitch_34
        0x4e81333 -> :sswitch_33
        0x4e86155 -> :sswitch_32
        0x4e86156 -> :sswitch_31
        0x5e8da3e -> :sswitch_30
        0x1a8350d6 -> :sswitch_2f
        0x2056f406 -> :sswitch_2e
        0x25e26ee2 -> :sswitch_2d
        0x2b45174d -> :sswitch_2c
        0x2b453ce4 -> :sswitch_2b
        0x2c0618eb -> :sswitch_2a
        0x2c065c6b -> :sswitch_29
        0x32fdf009 -> :sswitch_28
        0x3e4ca2d8 -> :sswitch_27
        0x54c61e47 -> :sswitch_26
        0x6bd6c624 -> :sswitch_25
        0x7446132a -> :sswitch_24
        0x7446b0a6 -> :sswitch_23
        0x744ad97d -> :sswitch_22
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
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
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x83 -> :sswitch_48
        0x86 -> :sswitch_47
        0x88 -> :sswitch_48
        0x9b -> :sswitch_48
        0x9f -> :sswitch_48
        0xa0 -> :sswitch_46
        0xa1 -> :sswitch_45
        0xa3 -> :sswitch_45
        0xa5 -> :sswitch_45
        0xa6 -> :sswitch_46
        0xae -> :sswitch_46
        0xb0 -> :sswitch_48
        0xb3 -> :sswitch_48
        0xb5 -> :sswitch_44
        0xb7 -> :sswitch_46
        0xba -> :sswitch_48
        0xbb -> :sswitch_46
        0xd7 -> :sswitch_48
        0xe0 -> :sswitch_46
        0xe1 -> :sswitch_46
        0xe7 -> :sswitch_48
        0xee -> :sswitch_48
        0xf0 -> :sswitch_48
        0xf1 -> :sswitch_48
        0xf7 -> :sswitch_48
        0xfb -> :sswitch_48
        0x41e4 -> :sswitch_46
        0x41e7 -> :sswitch_48
        0x41ed -> :sswitch_45
        0x4254 -> :sswitch_48
        0x4255 -> :sswitch_45
        0x4282 -> :sswitch_47
        0x4285 -> :sswitch_48
        0x42f7 -> :sswitch_48
        0x4489 -> :sswitch_44
        0x47e1 -> :sswitch_48
        0x47e2 -> :sswitch_45
        0x47e7 -> :sswitch_46
        0x47e8 -> :sswitch_48
        0x4dbb -> :sswitch_46
        0x5031 -> :sswitch_48
        0x5032 -> :sswitch_48
        0x5034 -> :sswitch_46
        0x5035 -> :sswitch_46
        0x536e -> :sswitch_47
        0x53ab -> :sswitch_45
        0x53ac -> :sswitch_48
        0x53b8 -> :sswitch_48
        0x54b0 -> :sswitch_48
        0x54b2 -> :sswitch_48
        0x54ba -> :sswitch_48
        0x55aa -> :sswitch_48
        0x55b0 -> :sswitch_46
        0x55b2 -> :sswitch_48
        0x55b9 -> :sswitch_48
        0x55ba -> :sswitch_48
        0x55bb -> :sswitch_48
        0x55bc -> :sswitch_48
        0x55bd -> :sswitch_48
        0x55d0 -> :sswitch_46
        0x55d1 -> :sswitch_44
        0x55d2 -> :sswitch_44
        0x55d3 -> :sswitch_44
        0x55d4 -> :sswitch_44
        0x55d5 -> :sswitch_44
        0x55d6 -> :sswitch_44
        0x55d7 -> :sswitch_44
        0x55d8 -> :sswitch_44
        0x55d9 -> :sswitch_44
        0x55da -> :sswitch_44
        0x55ee -> :sswitch_48
        0x56aa -> :sswitch_48
        0x56bb -> :sswitch_48
        0x6240 -> :sswitch_46
        0x6264 -> :sswitch_48
        0x63a2 -> :sswitch_45
        0x6d80 -> :sswitch_46
        0x75a1 -> :sswitch_46
        0x75a2 -> :sswitch_48
        0x7670 -> :sswitch_46
        0x7671 -> :sswitch_48
        0x7672 -> :sswitch_45
        0x7673 -> :sswitch_44
        0x7674 -> :sswitch_44
        0x7675 -> :sswitch_44
        0x22b59c -> :sswitch_47
        0x23e383 -> :sswitch_48
        0x2ad7b1 -> :sswitch_48
        0x114d9b74 -> :sswitch_46
        0x1549a966 -> :sswitch_46
        0x1654ae6b -> :sswitch_46
        0x18538067 -> :sswitch_46
        0x1a45dfa3 -> :sswitch_46
        0x1c53bb6b -> :sswitch_46
        0x1f43b675 -> :sswitch_46
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch
.end method

.method public final c(Ldefpackage/l51;)Z
    .locals 14

    .line 1
    new-instance p0, Ldefpackage/x7;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ldefpackage/x7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldefpackage/be3;

    .line 11
    .line 12
    check-cast p1, Ldefpackage/rk0;

    .line 13
    .line 14
    iget-wide v1, p1, Ldefpackage/rk0;->p:J

    .line 15
    .line 16
    const-wide/16 v3, -0x1

    .line 17
    .line 18
    cmp-long v3, v1, v3

    .line 19
    .line 20
    const-wide/16 v4, 0x400

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    cmp-long v6, v1, v4

    .line 25
    .line 26
    if-lez v6, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-wide v4, v1

    .line 30
    :cond_1
    :goto_0
    long-to-int v4, v4

    .line 31
    iget-object v5, v0, Ldefpackage/be3;->a:[B

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x4

    .line 35
    invoke-virtual {p1, v5, v6, v7, v6}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ldefpackage/be3;->C()J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    iput v7, p0, Ldefpackage/x7;->o:I

    .line 43
    .line 44
    :goto_1
    const-wide/32 v10, 0x1a45dfa3

    .line 45
    .line 46
    .line 47
    cmp-long v5, v8, v10

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    iget v5, p0, Ldefpackage/x7;->o:I

    .line 53
    .line 54
    add-int/2addr v5, v7

    .line 55
    iput v5, p0, Ldefpackage/x7;->o:I

    .line 56
    .line 57
    if-ne v5, v4, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    iget-object v5, v0, Ldefpackage/be3;->a:[B

    .line 61
    .line 62
    invoke-virtual {p1, v5, v6, v7, v6}, Ldefpackage/rk0;->e([BIIZ)Z

    .line 63
    .line 64
    .line 65
    const/16 v5, 0x8

    .line 66
    .line 67
    shl-long v7, v8, v5

    .line 68
    .line 69
    const-wide/16 v9, -0x100

    .line 70
    .line 71
    and-long/2addr v7, v9

    .line 72
    iget-object v5, v0, Ldefpackage/be3;->a:[B

    .line 73
    .line 74
    aget-byte v5, v5, v6

    .line 75
    .line 76
    and-int/lit16 v5, v5, 0xff

    .line 77
    .line 78
    int-to-long v9, v5

    .line 79
    or-long v8, v7, v9

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {p0, p1}, Ldefpackage/x7;->c(Ldefpackage/rk0;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    iget v0, p0, Ldefpackage/x7;->o:I

    .line 87
    .line 88
    int-to-long v8, v0

    .line 89
    const-wide/high16 v10, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v0, v4, v10

    .line 92
    .line 93
    if-eqz v0, :cond_8

    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    add-long v12, v8, v4

    .line 98
    .line 99
    cmp-long v0, v12, v1

    .line 100
    .line 101
    if-ltz v0, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    iget v0, p0, Ldefpackage/x7;->o:I

    .line 105
    .line 106
    int-to-long v0, v0

    .line 107
    add-long v2, v8, v4

    .line 108
    .line 109
    cmp-long v0, v0, v2

    .line 110
    .line 111
    if-gez v0, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Ldefpackage/x7;->c(Ldefpackage/rk0;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    cmp-long v0, v0, v10

    .line 118
    .line 119
    if-nez v0, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-virtual {p0, p1}, Ldefpackage/x7;->c(Ldefpackage/rk0;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    const-wide/16 v2, 0x0

    .line 127
    .line 128
    cmp-long v2, v0, v2

    .line 129
    .line 130
    if-ltz v2, :cond_8

    .line 131
    .line 132
    const-wide/32 v12, 0x7fffffff

    .line 133
    .line 134
    .line 135
    cmp-long v3, v0, v12

    .line 136
    .line 137
    if-lez v3, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    if-eqz v2, :cond_4

    .line 141
    .line 142
    long-to-int v0, v0

    .line 143
    invoke-virtual {p1, v0, v6}, Ldefpackage/rk0;->o(IZ)Z

    .line 144
    .line 145
    .line 146
    iget v1, p0, Ldefpackage/x7;->o:I

    .line 147
    .line 148
    add-int/2addr v1, v0

    .line 149
    iput v1, p0, Ldefpackage/x7;->o:I

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_7
    if-nez v0, :cond_8

    .line 153
    .line 154
    return v7

    .line 155
    :cond_8
    :goto_3
    return v6
.end method

.method public final d(JJ)V
    .locals 1

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Ldefpackage/ni2;->M:J

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    iput p3, p0, Ldefpackage/ni2;->O:I

    .line 10
    .line 11
    iget-object p4, p0, Ldefpackage/ni2;->a:Ldefpackage/mk0;

    .line 12
    .line 13
    iput p3, p4, Ldefpackage/mk0;->e:I

    .line 14
    .line 15
    iget-object v0, p4, Ldefpackage/mk0;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p4, p4, Ldefpackage/mk0;->c:Ldefpackage/k35;

    .line 21
    .line 22
    iput p3, p4, Ldefpackage/k35;->a:I

    .line 23
    .line 24
    iput p3, p4, Ldefpackage/k35;->b:I

    .line 25
    .line 26
    iget-object p4, p0, Ldefpackage/ni2;->b:Ldefpackage/k35;

    .line 27
    .line 28
    iput p3, p4, Ldefpackage/k35;->a:I

    .line 29
    .line 30
    iput p3, p4, Ldefpackage/k35;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/ni2;->m()V

    .line 33
    .line 34
    .line 35
    iput-boolean p3, p0, Ldefpackage/ni2;->D:Z

    .line 36
    .line 37
    iput-wide p1, p0, Ldefpackage/ni2;->E:J

    .line 38
    .line 39
    const/4 p1, -0x1

    .line 40
    iput p1, p0, Ldefpackage/ni2;->F:I

    .line 41
    .line 42
    const-wide/16 p1, -0x1

    .line 43
    .line 44
    iput-wide p1, p0, Ldefpackage/ni2;->G:J

    .line 45
    .line 46
    iput-wide p1, p0, Ldefpackage/ni2;->H:J

    .line 47
    .line 48
    iget-boolean p1, p0, Ldefpackage/ni2;->z:Z

    .line 49
    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    iget-object p1, p0, Ldefpackage/ni2;->C:Landroid/util/SparseArray;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 55
    .line 56
    .line 57
    :cond_0
    move p1, p3

    .line 58
    :goto_0
    iget-object p2, p0, Ldefpackage/ni2;->c:Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    if-ge p1, p4, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Ldefpackage/mi2;

    .line 71
    .line 72
    iget-object p2, p2, Ldefpackage/mi2;->V:Ldefpackage/my4;

    .line 73
    .line 74
    if-eqz p2, :cond_1

    .line 75
    .line 76
    iput-boolean p3, p2, Ldefpackage/my4;->b:Z

    .line 77
    .line 78
    iput p3, p2, Ldefpackage/my4;->c:I

    .line 79
    .line 80
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-void
.end method

.method public final f(Ldefpackage/m51;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/ni2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/ll;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ni2;->f:Ldefpackage/xn4;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Ldefpackage/ll;-><init>(Ldefpackage/m51;Ldefpackage/xn4;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    .line 14
    .line 15
    return-void
.end method

.method public final g(I)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Ldefpackage/ni2;->D:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v0, "Element "

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " must be in a Cues"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0
.end method

.method public final h(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ni2;->y:Ldefpackage/mi2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v0, "Element "

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " must be in a TrackEntry"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0
.end method

.method public final i(Ldefpackage/mi2;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/mi2;->V:Ldefpackage/my4;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 12
    .line 13
    iget-object v8, v1, Ldefpackage/mi2;->k:Ldefpackage/vv4;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Ldefpackage/my4;->b(Ldefpackage/wv4;JIIILdefpackage/vv4;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x2

    .line 38
    const-string v5, "S_TEXT/WEBVTT"

    .line 39
    .line 40
    const-string v6, "S_TEXT/SSA"

    .line 41
    .line 42
    const-string v7, "S_TEXT/ASS"

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    iget-object v2, v1, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    iget-object v2, v1, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget-object v2, v1, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    :cond_1
    iget v2, v0, Ldefpackage/ni2;->S:I

    .line 72
    .line 73
    const-string v10, "MatroskaExtractor"

    .line 74
    .line 75
    if-le v2, v9, :cond_2

    .line 76
    .line 77
    const-string v2, "Skipping subtitle sample in laced block."

    .line 78
    .line 79
    invoke-static {v10, v2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-wide v11, v0, Ldefpackage/ni2;->Q:J

    .line 84
    .line 85
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    cmp-long v2, v11, v13

    .line 91
    .line 92
    if-nez v2, :cond_4

    .line 93
    .line 94
    const-string v2, "Skipping subtitle sample with no duration."

    .line 95
    .line 96
    invoke-static {v10, v2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 100
    .line 101
    goto/16 :goto_5

    .line 102
    .line 103
    :cond_4
    iget-object v2, v1, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v10, v0, Ldefpackage/ni2;->m:Ldefpackage/be3;

    .line 106
    .line 107
    iget-object v13, v10, Ldefpackage/be3;->a:[B

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v14

    .line 116
    const/4 v15, -0x1

    .line 117
    sparse-switch v14, :sswitch_data_0

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_5

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    const/4 v15, 0x3

    .line 129
    goto :goto_1

    .line 130
    :sswitch_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_6

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    move v15, v4

    .line 138
    goto :goto_1

    .line 139
    :sswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_7

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    move v15, v9

    .line 147
    goto :goto_1

    .line 148
    :sswitch_3
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_8

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_8
    move v15, v8

    .line 156
    :goto_1
    const-wide/16 v2, 0x3e8

    .line 157
    .line 158
    packed-switch v15, :pswitch_data_0

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_0
    const-string v5, "%02d:%02d:%02d,%03d"

    .line 166
    .line 167
    invoke-static {v11, v12, v2, v3, v5}, Ldefpackage/ni2;->j(JJLjava/lang/String;)[B

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v3, 0x13

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_1
    const-string v5, "%02d:%02d:%02d.%03d"

    .line 175
    .line 176
    invoke-static {v11, v12, v2, v3, v5}, Ldefpackage/ni2;->j(JJLjava/lang/String;)[B

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/16 v3, 0x19

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 184
    .line 185
    const-wide/16 v5, 0x2710

    .line 186
    .line 187
    invoke-static {v11, v12, v5, v6, v2}, Ldefpackage/ni2;->j(JJLjava/lang/String;)[B

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const/16 v3, 0x15

    .line 192
    .line 193
    :goto_2
    array-length v5, v2

    .line 194
    invoke-static {v2, v8, v13, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 195
    .line 196
    .line 197
    iget v2, v10, Ldefpackage/be3;->b:I

    .line 198
    .line 199
    :goto_3
    iget v3, v10, Ldefpackage/be3;->c:I

    .line 200
    .line 201
    if-ge v2, v3, :cond_a

    .line 202
    .line 203
    iget-object v3, v10, Ldefpackage/be3;->a:[B

    .line 204
    .line 205
    aget-byte v3, v3, v2

    .line 206
    .line 207
    if-nez v3, :cond_9

    .line 208
    .line 209
    invoke-virtual {v10, v2}, Ldefpackage/be3;->M(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_a
    :goto_4
    iget-object v2, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 217
    .line 218
    iget v3, v10, Ldefpackage/be3;->c:I

    .line 219
    .line 220
    invoke-interface {v2, v3, v10}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 221
    .line 222
    .line 223
    iget v2, v10, Ldefpackage/be3;->c:I

    .line 224
    .line 225
    add-int v2, p5, v2

    .line 226
    .line 227
    :goto_5
    const/high16 v3, 0x10000000

    .line 228
    .line 229
    and-int v3, p4, v3

    .line 230
    .line 231
    if-eqz v3, :cond_c

    .line 232
    .line 233
    iget v3, v0, Ldefpackage/ni2;->S:I

    .line 234
    .line 235
    iget-object v5, v0, Ldefpackage/ni2;->p:Ldefpackage/be3;

    .line 236
    .line 237
    if-le v3, v9, :cond_b

    .line 238
    .line 239
    invoke-virtual {v5, v8}, Ldefpackage/be3;->K(I)V

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_b
    iget v3, v5, Ldefpackage/be3;->c:I

    .line 244
    .line 245
    iget-object v6, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 246
    .line 247
    invoke-interface {v6, v5, v3, v4}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 248
    .line 249
    .line 250
    add-int/2addr v2, v3

    .line 251
    :cond_c
    :goto_6
    move v14, v2

    .line 252
    iget-object v10, v1, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 253
    .line 254
    iget-object v1, v1, Ldefpackage/mi2;->k:Ldefpackage/vv4;

    .line 255
    .line 256
    move-wide/from16 v11, p2

    .line 257
    .line 258
    move/from16 v13, p4

    .line 259
    .line 260
    move/from16 v15, p6

    .line 261
    .line 262
    move-object/from16 v16, v1

    .line 263
    .line 264
    invoke-interface/range {v10 .. v16}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 265
    .line 266
    .line 267
    :goto_7
    iput-boolean v9, v0, Ldefpackage/ni2;->N:Z

    .line 268
    .line 269
    return-void

    .line 270
    nop

    .line 271
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_3
        0x2c065c6b -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/ni2;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    iget-object v2, p0, Ldefpackage/ni2;->c:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ldefpackage/mi2;

    .line 21
    .line 22
    iget-boolean v2, v2, Ldefpackage/mi2;->W:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    :goto_1
    return-void

    .line 27
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v1, p0, Ldefpackage/ni2;->j0:Ldefpackage/m51;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ldefpackage/m51;->p()V

    .line 36
    .line 37
    .line 38
    iput-boolean v0, p0, Ldefpackage/ni2;->x:Z

    .line 39
    .line 40
    return-void
.end method

.method public final l(Ldefpackage/l51;I)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/ni2;->i:Ldefpackage/be3;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/be3;->c:I

    .line 4
    .line 5
    if-lt v0, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/be3;->a:[B

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    if-ge v1, p2, :cond_1

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    mul-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0, v0}, Ldefpackage/be3;->c(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Ldefpackage/be3;->a:[B

    .line 24
    .line 25
    iget v1, p0, Ldefpackage/be3;->c:I

    .line 26
    .line 27
    sub-int v2, p2, v1

    .line 28
    .line 29
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/l51;->readFully([BII)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Ldefpackage/be3;->M(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/ni2;->a0:I

    .line 3
    .line 4
    iput v0, p0, Ldefpackage/ni2;->b0:I

    .line 5
    .line 6
    iput v0, p0, Ldefpackage/ni2;->c0:I

    .line 7
    .line 8
    iput-boolean v0, p0, Ldefpackage/ni2;->d0:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Ldefpackage/ni2;->e0:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Ldefpackage/ni2;->f0:Z

    .line 13
    .line 14
    iput v0, p0, Ldefpackage/ni2;->g0:I

    .line 15
    .line 16
    iput-byte v0, p0, Ldefpackage/ni2;->h0:B

    .line 17
    .line 18
    iput-boolean v0, p0, Ldefpackage/ni2;->i0:Z

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/ni2;->l:Ldefpackage/be3;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ldefpackage/be3;->K(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final n(J)J
    .locals 7

    .line 1
    iget-wide v2, p0, Ldefpackage/ni2;->t:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v2, v0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    const-wide/16 v4, 0x3e8

    .line 17
    .line 18
    move-wide v0, p1

    .line 19
    invoke-static/range {v0 .. v6}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    const-string p0, "Can\'t scale timecode prior to timecodeScale being set."

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0
.end method

.method public final o(Ldefpackage/l51;Ldefpackage/mi2;IZ)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "S_TEXT/UTF8"

    .line 10
    .line 11
    iget-object v5, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    sget-object v2, Ldefpackage/ni2;->k0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/ni2;->p(Ldefpackage/l51;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, Ldefpackage/ni2;->b0:I

    .line 25
    .line 26
    invoke-virtual {v0}, Ldefpackage/ni2;->m()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const-string v4, "S_TEXT/ASS"

    .line 31
    .line 32
    iget-object v5, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_24

    .line 39
    .line 40
    const-string v4, "S_TEXT/SSA"

    .line 41
    .line 42
    iget-object v5, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    goto/16 :goto_f

    .line 51
    .line 52
    :cond_1
    const-string v4, "S_TEXT/WEBVTT"

    .line 53
    .line 54
    iget-object v5, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    sget-object v2, Ldefpackage/ni2;->n0:[B

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/ni2;->p(Ldefpackage/l51;[BI)V

    .line 65
    .line 66
    .line 67
    iget v1, v0, Ldefpackage/ni2;->b0:I

    .line 68
    .line 69
    invoke-virtual {v0}, Ldefpackage/ni2;->m()V

    .line 70
    .line 71
    .line 72
    return v1

    .line 73
    :cond_2
    iget-boolean v4, v2, Ldefpackage/mi2;->W:Z

    .line 74
    .line 75
    const/4 v5, 0x2

    .line 76
    const/4 v6, 0x1

    .line 77
    const/4 v7, 0x0

    .line 78
    if-eqz v4, :cond_7

    .line 79
    .line 80
    iget-object v4, v2, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v4, Ldefpackage/be3;

    .line 86
    .line 87
    invoke-direct {v4, v3}, Ldefpackage/be3;-><init>(I)V

    .line 88
    .line 89
    .line 90
    iget-object v8, v4, Ldefpackage/be3;->a:[B

    .line 91
    .line 92
    invoke-interface {v1, v8, v7, v3, v6}, Ldefpackage/l51;->e([BIIZ)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-nez v8, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-interface {v1}, Ldefpackage/l51;->k()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ldefpackage/be3;->i()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-static {v8}, Ldefpackage/e35;->z(I)I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-ne v8, v6, :cond_6

    .line 111
    .line 112
    invoke-virtual {v4}, Ldefpackage/be3;->a()I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    const/16 v9, 0xa

    .line 117
    .line 118
    if-ge v8, v9, :cond_4

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    new-array v8, v9, [B

    .line 122
    .line 123
    invoke-virtual {v4, v8, v7, v9}, Ldefpackage/be3;->k([BII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v7}, Ldefpackage/be3;->N(I)V

    .line 127
    .line 128
    .line 129
    invoke-static {v8}, Ldefpackage/e35;->y([B)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-lez v8, :cond_6

    .line 134
    .line 135
    invoke-virtual {v4}, Ldefpackage/be3;->a()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    add-int/lit8 v10, v8, 0x4

    .line 140
    .line 141
    if-ge v9, v10, :cond_5

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    invoke-virtual {v4, v8}, Ldefpackage/be3;->O(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ldefpackage/be3;->m()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-static {v4}, Ldefpackage/e35;->z(I)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-ne v4, v5, :cond_6

    .line 156
    .line 157
    iget-object v4, v2, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 158
    .line 159
    invoke-virtual {v4}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const-string v8, "audio/vnd.dts.hd"

    .line 164
    .line 165
    invoke-static {v8}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    iput-object v8, v4, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 170
    .line 171
    new-instance v8, Ldefpackage/tb1;

    .line 172
    .line 173
    invoke-direct {v8, v4}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 174
    .line 175
    .line 176
    iput-object v8, v2, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 177
    .line 178
    :cond_6
    :goto_0
    iget-object v4, v2, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 179
    .line 180
    iget-object v8, v2, Ldefpackage/mi2;->b0:Ldefpackage/tb1;

    .line 181
    .line 182
    invoke-interface {v4, v8}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v7, v2, Ldefpackage/mi2;->W:Z

    .line 186
    .line 187
    invoke-virtual {v0}, Ldefpackage/ni2;->k()V

    .line 188
    .line 189
    .line 190
    :cond_7
    iget-object v4, v2, Ldefpackage/mi2;->a0:Ldefpackage/wv4;

    .line 191
    .line 192
    iget-boolean v8, v0, Ldefpackage/ni2;->d0:Z

    .line 193
    .line 194
    iget-object v9, v0, Ldefpackage/ni2;->l:Ldefpackage/be3;

    .line 195
    .line 196
    const/4 v10, 0x4

    .line 197
    if-nez v8, :cond_19

    .line 198
    .line 199
    iget-boolean v8, v2, Ldefpackage/mi2;->i:Z

    .line 200
    .line 201
    iget-object v11, v0, Ldefpackage/ni2;->i:Ldefpackage/be3;

    .line 202
    .line 203
    if-eqz v8, :cond_14

    .line 204
    .line 205
    iget v8, v0, Ldefpackage/ni2;->W:I

    .line 206
    .line 207
    const v12, -0x40000001    # -1.9999999f

    .line 208
    .line 209
    .line 210
    and-int/2addr v8, v12

    .line 211
    iput v8, v0, Ldefpackage/ni2;->W:I

    .line 212
    .line 213
    iget-boolean v8, v0, Ldefpackage/ni2;->e0:Z

    .line 214
    .line 215
    const/16 v12, 0x80

    .line 216
    .line 217
    if-nez v8, :cond_9

    .line 218
    .line 219
    iget-object v8, v11, Ldefpackage/be3;->a:[B

    .line 220
    .line 221
    invoke-interface {v1, v8, v7, v6}, Ldefpackage/l51;->readFully([BII)V

    .line 222
    .line 223
    .line 224
    iget v8, v0, Ldefpackage/ni2;->a0:I

    .line 225
    .line 226
    add-int/2addr v8, v6

    .line 227
    iput v8, v0, Ldefpackage/ni2;->a0:I

    .line 228
    .line 229
    iget-object v8, v11, Ldefpackage/be3;->a:[B

    .line 230
    .line 231
    aget-byte v8, v8, v7

    .line 232
    .line 233
    and-int/lit16 v13, v8, 0x80

    .line 234
    .line 235
    if-eq v13, v12, :cond_8

    .line 236
    .line 237
    iput-byte v8, v0, Ldefpackage/ni2;->h0:B

    .line 238
    .line 239
    iput-boolean v6, v0, Ldefpackage/ni2;->e0:Z

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_8
    const-string v0, "Extension bit is set in signal byte"

    .line 243
    .line 244
    const/4 v1, 0x0

    .line 245
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    throw v0

    .line 250
    :cond_9
    :goto_1
    iget-byte v8, v0, Ldefpackage/ni2;->h0:B

    .line 251
    .line 252
    and-int/lit8 v13, v8, 0x1

    .line 253
    .line 254
    if-ne v13, v6, :cond_13

    .line 255
    .line 256
    and-int/2addr v8, v5

    .line 257
    if-ne v8, v5, :cond_a

    .line 258
    .line 259
    move v8, v6

    .line 260
    goto :goto_2

    .line 261
    :cond_a
    move v8, v7

    .line 262
    :goto_2
    iget v13, v0, Ldefpackage/ni2;->W:I

    .line 263
    .line 264
    const/high16 v14, 0x40000000    # 2.0f

    .line 265
    .line 266
    or-int/2addr v13, v14

    .line 267
    iput v13, v0, Ldefpackage/ni2;->W:I

    .line 268
    .line 269
    iget-boolean v13, v0, Ldefpackage/ni2;->i0:Z

    .line 270
    .line 271
    if-nez v13, :cond_c

    .line 272
    .line 273
    iget-object v13, v0, Ldefpackage/ni2;->n:Ldefpackage/be3;

    .line 274
    .line 275
    iget-object v14, v13, Ldefpackage/be3;->a:[B

    .line 276
    .line 277
    const/16 v15, 0x8

    .line 278
    .line 279
    invoke-interface {v1, v14, v7, v15}, Ldefpackage/l51;->readFully([BII)V

    .line 280
    .line 281
    .line 282
    iget v14, v0, Ldefpackage/ni2;->a0:I

    .line 283
    .line 284
    add-int/2addr v14, v15

    .line 285
    iput v14, v0, Ldefpackage/ni2;->a0:I

    .line 286
    .line 287
    iput-boolean v6, v0, Ldefpackage/ni2;->i0:Z

    .line 288
    .line 289
    iget-object v14, v11, Ldefpackage/be3;->a:[B

    .line 290
    .line 291
    if-eqz v8, :cond_b

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_b
    move v12, v7

    .line 295
    :goto_3
    or-int/2addr v12, v15

    .line 296
    int-to-byte v12, v12

    .line 297
    aput-byte v12, v14, v7

    .line 298
    .line 299
    invoke-virtual {v11, v7}, Ldefpackage/be3;->N(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v4, v11, v6, v6}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 303
    .line 304
    .line 305
    iget v12, v0, Ldefpackage/ni2;->b0:I

    .line 306
    .line 307
    add-int/2addr v12, v6

    .line 308
    iput v12, v0, Ldefpackage/ni2;->b0:I

    .line 309
    .line 310
    invoke-virtual {v13, v7}, Ldefpackage/be3;->N(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v4, v13, v15, v6}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 314
    .line 315
    .line 316
    iget v12, v0, Ldefpackage/ni2;->b0:I

    .line 317
    .line 318
    add-int/2addr v12, v15

    .line 319
    iput v12, v0, Ldefpackage/ni2;->b0:I

    .line 320
    .line 321
    :cond_c
    if-eqz v8, :cond_13

    .line 322
    .line 323
    iget-boolean v8, v0, Ldefpackage/ni2;->f0:Z

    .line 324
    .line 325
    if-nez v8, :cond_d

    .line 326
    .line 327
    iget-object v8, v11, Ldefpackage/be3;->a:[B

    .line 328
    .line 329
    invoke-interface {v1, v8, v7, v6}, Ldefpackage/l51;->readFully([BII)V

    .line 330
    .line 331
    .line 332
    iget v8, v0, Ldefpackage/ni2;->a0:I

    .line 333
    .line 334
    add-int/2addr v8, v6

    .line 335
    iput v8, v0, Ldefpackage/ni2;->a0:I

    .line 336
    .line 337
    invoke-virtual {v11, v7}, Ldefpackage/be3;->N(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v11}, Ldefpackage/be3;->A()I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    iput v8, v0, Ldefpackage/ni2;->g0:I

    .line 345
    .line 346
    iput-boolean v6, v0, Ldefpackage/ni2;->f0:Z

    .line 347
    .line 348
    :cond_d
    iget v8, v0, Ldefpackage/ni2;->g0:I

    .line 349
    .line 350
    mul-int/2addr v8, v10

    .line 351
    invoke-virtual {v11, v8}, Ldefpackage/be3;->K(I)V

    .line 352
    .line 353
    .line 354
    iget-object v12, v11, Ldefpackage/be3;->a:[B

    .line 355
    .line 356
    invoke-interface {v1, v12, v7, v8}, Ldefpackage/l51;->readFully([BII)V

    .line 357
    .line 358
    .line 359
    iget v12, v0, Ldefpackage/ni2;->a0:I

    .line 360
    .line 361
    add-int/2addr v12, v8

    .line 362
    iput v12, v0, Ldefpackage/ni2;->a0:I

    .line 363
    .line 364
    iget v8, v0, Ldefpackage/ni2;->g0:I

    .line 365
    .line 366
    div-int/2addr v8, v5

    .line 367
    add-int/2addr v8, v6

    .line 368
    int-to-short v8, v8

    .line 369
    mul-int/lit8 v12, v8, 0x6

    .line 370
    .line 371
    add-int/2addr v12, v5

    .line 372
    iget-object v13, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    if-eqz v13, :cond_e

    .line 375
    .line 376
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    .line 377
    .line 378
    .line 379
    move-result v13

    .line 380
    if-ge v13, v12, :cond_f

    .line 381
    .line 382
    :cond_e
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    iput-object v13, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 387
    .line 388
    :cond_f
    iget-object v13, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 389
    .line 390
    invoke-virtual {v13, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 391
    .line 392
    .line 393
    iget-object v13, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    invoke-virtual {v13, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 396
    .line 397
    .line 398
    move v8, v7

    .line 399
    move v13, v8

    .line 400
    :goto_4
    iget v14, v0, Ldefpackage/ni2;->g0:I

    .line 401
    .line 402
    if-ge v8, v14, :cond_11

    .line 403
    .line 404
    invoke-virtual {v11}, Ldefpackage/be3;->E()I

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    rem-int/lit8 v15, v8, 0x2

    .line 409
    .line 410
    move/from16 v16, v5

    .line 411
    .line 412
    iget-object v5, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 413
    .line 414
    if-nez v15, :cond_10

    .line 415
    .line 416
    sub-int v13, v14, v13

    .line 417
    .line 418
    int-to-short v13, v13

    .line 419
    invoke-virtual {v5, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 420
    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_10
    sub-int v13, v14, v13

    .line 424
    .line 425
    invoke-virtual {v5, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 426
    .line 427
    .line 428
    :goto_5
    add-int/lit8 v8, v8, 0x1

    .line 429
    .line 430
    move v13, v14

    .line 431
    move/from16 v5, v16

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :cond_11
    move/from16 v16, v5

    .line 435
    .line 436
    iget v5, v0, Ldefpackage/ni2;->a0:I

    .line 437
    .line 438
    sub-int v5, v3, v5

    .line 439
    .line 440
    sub-int/2addr v5, v13

    .line 441
    rem-int/lit8 v14, v14, 0x2

    .line 442
    .line 443
    iget-object v8, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 444
    .line 445
    if-ne v14, v6, :cond_12

    .line 446
    .line 447
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_12
    int-to-short v5, v5

    .line 452
    invoke-virtual {v8, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    .line 455
    iget-object v5, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 456
    .line 457
    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 458
    .line 459
    .line 460
    :goto_6
    iget-object v5, v0, Ldefpackage/ni2;->q:Ljava/nio/ByteBuffer;

    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    iget-object v8, v0, Ldefpackage/ni2;->o:Ldefpackage/be3;

    .line 467
    .line 468
    invoke-virtual {v8, v12, v5}, Ldefpackage/be3;->L(I[B)V

    .line 469
    .line 470
    .line 471
    invoke-interface {v4, v8, v12, v6}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 472
    .line 473
    .line 474
    iget v5, v0, Ldefpackage/ni2;->b0:I

    .line 475
    .line 476
    add-int/2addr v5, v12

    .line 477
    iput v5, v0, Ldefpackage/ni2;->b0:I

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_13
    move/from16 v16, v5

    .line 481
    .line 482
    goto :goto_7

    .line 483
    :cond_14
    move/from16 v16, v5

    .line 484
    .line 485
    iget-object v5, v2, Ldefpackage/mi2;->j:[B

    .line 486
    .line 487
    if-eqz v5, :cond_15

    .line 488
    .line 489
    array-length v8, v5

    .line 490
    invoke-virtual {v9, v8, v5}, Ldefpackage/be3;->L(I[B)V

    .line 491
    .line 492
    .line 493
    :cond_15
    :goto_7
    const-string v5, "A_OPUS"

    .line 494
    .line 495
    iget-object v8, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-eqz v5, :cond_16

    .line 502
    .line 503
    move/from16 v5, p4

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_16
    iget v5, v2, Ldefpackage/mi2;->g:I

    .line 507
    .line 508
    if-lez v5, :cond_17

    .line 509
    .line 510
    move v5, v6

    .line 511
    goto :goto_8

    .line 512
    :cond_17
    move v5, v7

    .line 513
    :goto_8
    if-eqz v5, :cond_18

    .line 514
    .line 515
    iget v5, v0, Ldefpackage/ni2;->W:I

    .line 516
    .line 517
    const/high16 v8, 0x10000000

    .line 518
    .line 519
    or-int/2addr v5, v8

    .line 520
    iput v5, v0, Ldefpackage/ni2;->W:I

    .line 521
    .line 522
    iget-object v5, v0, Ldefpackage/ni2;->p:Ldefpackage/be3;

    .line 523
    .line 524
    invoke-virtual {v5, v7}, Ldefpackage/be3;->K(I)V

    .line 525
    .line 526
    .line 527
    iget v5, v9, Ldefpackage/be3;->c:I

    .line 528
    .line 529
    add-int/2addr v5, v3

    .line 530
    iget v8, v0, Ldefpackage/ni2;->a0:I

    .line 531
    .line 532
    sub-int/2addr v5, v8

    .line 533
    invoke-virtual {v11, v10}, Ldefpackage/be3;->K(I)V

    .line 534
    .line 535
    .line 536
    iget-object v8, v11, Ldefpackage/be3;->a:[B

    .line 537
    .line 538
    shr-int/lit8 v12, v5, 0x18

    .line 539
    .line 540
    and-int/lit16 v12, v12, 0xff

    .line 541
    .line 542
    int-to-byte v12, v12

    .line 543
    aput-byte v12, v8, v7

    .line 544
    .line 545
    shr-int/lit8 v12, v5, 0x10

    .line 546
    .line 547
    and-int/lit16 v12, v12, 0xff

    .line 548
    .line 549
    int-to-byte v12, v12

    .line 550
    aput-byte v12, v8, v6

    .line 551
    .line 552
    shr-int/lit8 v12, v5, 0x8

    .line 553
    .line 554
    and-int/lit16 v12, v12, 0xff

    .line 555
    .line 556
    int-to-byte v12, v12

    .line 557
    aput-byte v12, v8, v16

    .line 558
    .line 559
    and-int/lit16 v5, v5, 0xff

    .line 560
    .line 561
    int-to-byte v5, v5

    .line 562
    const/4 v12, 0x3

    .line 563
    aput-byte v5, v8, v12

    .line 564
    .line 565
    move/from16 v5, v16

    .line 566
    .line 567
    invoke-interface {v4, v11, v10, v5}, Ldefpackage/wv4;->b(Ldefpackage/be3;II)V

    .line 568
    .line 569
    .line 570
    iget v5, v0, Ldefpackage/ni2;->b0:I

    .line 571
    .line 572
    add-int/2addr v5, v10

    .line 573
    iput v5, v0, Ldefpackage/ni2;->b0:I

    .line 574
    .line 575
    :cond_18
    iput-boolean v6, v0, Ldefpackage/ni2;->d0:Z

    .line 576
    .line 577
    :cond_19
    iget v5, v9, Ldefpackage/be3;->c:I

    .line 578
    .line 579
    add-int/2addr v3, v5

    .line 580
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 581
    .line 582
    iget-object v8, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    if-nez v5, :cond_1e

    .line 589
    .line 590
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 591
    .line 592
    iget-object v8, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    if-eqz v5, :cond_1a

    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_1a
    iget-object v5, v2, Ldefpackage/mi2;->V:Ldefpackage/my4;

    .line 602
    .line 603
    if-eqz v5, :cond_1c

    .line 604
    .line 605
    iget v5, v9, Ldefpackage/be3;->c:I

    .line 606
    .line 607
    if-nez v5, :cond_1b

    .line 608
    .line 609
    goto :goto_9

    .line 610
    :cond_1b
    move v6, v7

    .line 611
    :goto_9
    invoke-static {v6}, Ldefpackage/rr2;->w(Z)V

    .line 612
    .line 613
    .line 614
    iget-object v5, v2, Ldefpackage/mi2;->V:Ldefpackage/my4;

    .line 615
    .line 616
    invoke-virtual {v5, v1}, Ldefpackage/my4;->c(Ldefpackage/l51;)V

    .line 617
    .line 618
    .line 619
    :cond_1c
    :goto_a
    iget v5, v0, Ldefpackage/ni2;->a0:I

    .line 620
    .line 621
    if-ge v5, v3, :cond_22

    .line 622
    .line 623
    sub-int v5, v3, v5

    .line 624
    .line 625
    invoke-virtual {v9}, Ldefpackage/be3;->a()I

    .line 626
    .line 627
    .line 628
    move-result v6

    .line 629
    if-lez v6, :cond_1d

    .line 630
    .line 631
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    invoke-interface {v4, v5, v9}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 636
    .line 637
    .line 638
    goto :goto_b

    .line 639
    :cond_1d
    invoke-interface {v4, v1, v5, v7}, Ldefpackage/wv4;->f(Ldefpackage/wh0;IZ)I

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    :goto_b
    iget v6, v0, Ldefpackage/ni2;->a0:I

    .line 644
    .line 645
    add-int/2addr v6, v5

    .line 646
    iput v6, v0, Ldefpackage/ni2;->a0:I

    .line 647
    .line 648
    iget v6, v0, Ldefpackage/ni2;->b0:I

    .line 649
    .line 650
    add-int/2addr v6, v5

    .line 651
    iput v6, v0, Ldefpackage/ni2;->b0:I

    .line 652
    .line 653
    goto :goto_a

    .line 654
    :cond_1e
    :goto_c
    iget-object v5, v0, Ldefpackage/ni2;->h:Ldefpackage/be3;

    .line 655
    .line 656
    iget-object v8, v5, Ldefpackage/be3;->a:[B

    .line 657
    .line 658
    aput-byte v7, v8, v7

    .line 659
    .line 660
    aput-byte v7, v8, v6

    .line 661
    .line 662
    const/16 v16, 0x2

    .line 663
    .line 664
    aput-byte v7, v8, v16

    .line 665
    .line 666
    iget v6, v2, Ldefpackage/mi2;->c0:I

    .line 667
    .line 668
    rsub-int/lit8 v11, v6, 0x4

    .line 669
    .line 670
    :goto_d
    iget v12, v0, Ldefpackage/ni2;->a0:I

    .line 671
    .line 672
    if-ge v12, v3, :cond_22

    .line 673
    .line 674
    iget v12, v0, Ldefpackage/ni2;->c0:I

    .line 675
    .line 676
    if-nez v12, :cond_20

    .line 677
    .line 678
    invoke-virtual {v9}, Ldefpackage/be3;->a()I

    .line 679
    .line 680
    .line 681
    move-result v12

    .line 682
    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    .line 683
    .line 684
    .line 685
    move-result v12

    .line 686
    add-int v13, v11, v12

    .line 687
    .line 688
    sub-int v14, v6, v12

    .line 689
    .line 690
    invoke-interface {v1, v8, v13, v14}, Ldefpackage/l51;->readFully([BII)V

    .line 691
    .line 692
    .line 693
    if-lez v12, :cond_1f

    .line 694
    .line 695
    invoke-virtual {v9, v8, v11, v12}, Ldefpackage/be3;->k([BII)V

    .line 696
    .line 697
    .line 698
    :cond_1f
    iget v12, v0, Ldefpackage/ni2;->a0:I

    .line 699
    .line 700
    add-int/2addr v12, v6

    .line 701
    iput v12, v0, Ldefpackage/ni2;->a0:I

    .line 702
    .line 703
    invoke-virtual {v5, v7}, Ldefpackage/be3;->N(I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v5}, Ldefpackage/be3;->E()I

    .line 707
    .line 708
    .line 709
    move-result v12

    .line 710
    iput v12, v0, Ldefpackage/ni2;->c0:I

    .line 711
    .line 712
    iget-object v12, v0, Ldefpackage/ni2;->g:Ldefpackage/be3;

    .line 713
    .line 714
    invoke-virtual {v12, v7}, Ldefpackage/be3;->N(I)V

    .line 715
    .line 716
    .line 717
    invoke-interface {v4, v10, v12}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 718
    .line 719
    .line 720
    iget v12, v0, Ldefpackage/ni2;->b0:I

    .line 721
    .line 722
    add-int/2addr v12, v10

    .line 723
    iput v12, v0, Ldefpackage/ni2;->b0:I

    .line 724
    .line 725
    goto :goto_d

    .line 726
    :cond_20
    invoke-virtual {v9}, Ldefpackage/be3;->a()I

    .line 727
    .line 728
    .line 729
    move-result v13

    .line 730
    if-lez v13, :cond_21

    .line 731
    .line 732
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 733
    .line 734
    .line 735
    move-result v12

    .line 736
    invoke-interface {v4, v12, v9}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 737
    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_21
    invoke-interface {v4, v1, v12, v7}, Ldefpackage/wv4;->f(Ldefpackage/wh0;IZ)I

    .line 741
    .line 742
    .line 743
    move-result v12

    .line 744
    :goto_e
    iget v13, v0, Ldefpackage/ni2;->a0:I

    .line 745
    .line 746
    add-int/2addr v13, v12

    .line 747
    iput v13, v0, Ldefpackage/ni2;->a0:I

    .line 748
    .line 749
    iget v13, v0, Ldefpackage/ni2;->b0:I

    .line 750
    .line 751
    add-int/2addr v13, v12

    .line 752
    iput v13, v0, Ldefpackage/ni2;->b0:I

    .line 753
    .line 754
    iget v13, v0, Ldefpackage/ni2;->c0:I

    .line 755
    .line 756
    sub-int/2addr v13, v12

    .line 757
    iput v13, v0, Ldefpackage/ni2;->c0:I

    .line 758
    .line 759
    goto :goto_d

    .line 760
    :cond_22
    const-string v1, "A_VORBIS"

    .line 761
    .line 762
    iget-object v2, v2, Ldefpackage/mi2;->c:Ljava/lang/String;

    .line 763
    .line 764
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v1

    .line 768
    if-eqz v1, :cond_23

    .line 769
    .line 770
    iget-object v1, v0, Ldefpackage/ni2;->j:Ldefpackage/be3;

    .line 771
    .line 772
    invoke-virtual {v1, v7}, Ldefpackage/be3;->N(I)V

    .line 773
    .line 774
    .line 775
    invoke-interface {v4, v10, v1}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 776
    .line 777
    .line 778
    iget v1, v0, Ldefpackage/ni2;->b0:I

    .line 779
    .line 780
    add-int/2addr v1, v10

    .line 781
    iput v1, v0, Ldefpackage/ni2;->b0:I

    .line 782
    .line 783
    :cond_23
    iget v1, v0, Ldefpackage/ni2;->b0:I

    .line 784
    .line 785
    invoke-virtual {v0}, Ldefpackage/ni2;->m()V

    .line 786
    .line 787
    .line 788
    return v1

    .line 789
    :cond_24
    :goto_f
    sget-object v2, Ldefpackage/ni2;->m0:[B

    .line 790
    .line 791
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/ni2;->p(Ldefpackage/l51;[BI)V

    .line 792
    .line 793
    .line 794
    iget v1, v0, Ldefpackage/ni2;->b0:I

    .line 795
    .line 796
    invoke-virtual {v0}, Ldefpackage/ni2;->m()V

    .line 797
    .line 798
    .line 799
    return v1
.end method

.method public final p(Ldefpackage/l51;[BI)V
    .locals 4

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object p0, p0, Ldefpackage/ni2;->m:Ldefpackage/be3;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/be3;->a:[B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    add-int v1, v0, p3

    .line 12
    .line 13
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    array-length v2, v1

    .line 21
    invoke-virtual {p0, v2, v1}, Ldefpackage/be3;->L(I[B)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v2, p2

    .line 26
    invoke-static {p2, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, p0, Ldefpackage/be3;->a:[B

    .line 30
    .line 31
    array-length p2, p2

    .line 32
    invoke-interface {p1, v1, p2, p3}, Ldefpackage/l51;->readFully([BII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ldefpackage/be3;->N(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ldefpackage/be3;->M(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
