.class public final Ldefpackage/bu1;
.super Ldefpackage/fh0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:J

.field public o:J

.field public final synthetic p:Ldefpackage/cu1;


# direct methods
.method public constructor <init>(Ldefpackage/cu1;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/bu1;->p:Ldefpackage/cu1;

    .line 5
    .line 6
    iput-wide p2, p0, Ldefpackage/bu1;->n:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 8

    .line 1
    iget-wide v0, p0, Ldefpackage/bu1;->n:J

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/bu1;->o:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    iget-object p0, p0, Ldefpackage/bu1;->p:Ldefpackage/cu1;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 9
    .line 10
    iget v2, p0, Ldefpackage/qs;->q:I

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    iget-object p0, p0, Ldefpackage/qs;->n:Ldefpackage/df0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-long v4, p0

    .line 20
    const-wide/16 v6, 0x8

    .line 21
    .line 22
    mul-long/2addr v4, v6

    .line 23
    add-long/2addr v4, v2

    .line 24
    div-long/2addr v4, v6

    .line 25
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p0, v0

    .line 30
    return p0
.end method

.method public final o()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/bu1;->o:J

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/bu1;->n:J

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final r([BII)I
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-wide v1, p0, Ldefpackage/bu1;->n:J

    .line 6
    .line 7
    iget-wide v3, p0, Ldefpackage/bu1;->o:J

    .line 8
    .line 9
    sub-long/2addr v1, v3

    .line 10
    int-to-long v3, p3

    .line 11
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    long-to-int p3, v1

    .line 16
    :goto_0
    if-ge v0, p3, :cond_6

    .line 17
    .line 18
    iget-object v1, p0, Ldefpackage/bu1;->p:Ldefpackage/cu1;

    .line 19
    .line 20
    iget-object v2, v1, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 21
    .line 22
    iget-object v3, v1, Ldefpackage/cu1;->r:Ldefpackage/i;

    .line 23
    .line 24
    iget v4, v2, Ldefpackage/qs;->q:I

    .line 25
    .line 26
    const v5, 0xffff

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-lez v4, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    invoke-static {v2, v1}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    long-to-int v1, v1

    .line 39
    int-to-byte v1, v1

    .line 40
    add-int v2, p2, v0

    .line 41
    .line 42
    iget-object v4, v3, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, [B

    .line 45
    .line 46
    iget v7, v3, Ldefpackage/i;->a:I

    .line 47
    .line 48
    aput-byte v1, v4, v7

    .line 49
    .line 50
    add-int/lit8 v4, v7, 0x1

    .line 51
    .line 52
    and-int/2addr v4, v5

    .line 53
    iget-boolean v5, v3, Ldefpackage/i;->b:Z

    .line 54
    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    if-ge v4, v7, :cond_1

    .line 58
    .line 59
    iput-boolean v6, v3, Ldefpackage/i;->b:Z

    .line 60
    .line 61
    :cond_1
    iput v4, v3, Ldefpackage/i;->a:I

    .line 62
    .line 63
    aput-byte v1, p1, v2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v1, v1, Ldefpackage/cu1;->q:Ljava/io/ByteArrayInputStream;

    .line 67
    .line 68
    add-int v2, p2, v0

    .line 69
    .line 70
    sub-int v4, p3, v0

    .line 71
    .line 72
    invoke-virtual {v1, p1, v2, v4}, Ljava/io/InputStream;->read([BII)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/4 v4, -0x1

    .line 77
    if-eq v1, v4, :cond_5

    .line 78
    .line 79
    move v4, v2

    .line 80
    :goto_1
    add-int v7, v2, v1

    .line 81
    .line 82
    if-ge v4, v7, :cond_4

    .line 83
    .line 84
    aget-byte v7, p1, v4

    .line 85
    .line 86
    iget-object v8, v3, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v8, [B

    .line 89
    .line 90
    iget v9, v3, Ldefpackage/i;->a:I

    .line 91
    .line 92
    aput-byte v7, v8, v9

    .line 93
    .line 94
    add-int/lit8 v7, v9, 0x1

    .line 95
    .line 96
    and-int/2addr v7, v5

    .line 97
    iget-boolean v8, v3, Ldefpackage/i;->b:Z

    .line 98
    .line 99
    if-nez v8, :cond_3

    .line 100
    .line 101
    if-ge v7, v9, :cond_3

    .line 102
    .line 103
    iput-boolean v6, v3, Ldefpackage/i;->b:Z

    .line 104
    .line 105
    :cond_3
    iput v7, v3, Ldefpackage/i;->a:I

    .line 106
    .line 107
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    move v6, v1

    .line 111
    :goto_2
    iget-wide v1, p0, Ldefpackage/bu1;->o:J

    .line 112
    .line 113
    int-to-long v3, v6

    .line 114
    add-long/2addr v1, v3

    .line 115
    iput-wide v1, p0, Ldefpackage/bu1;->o:J

    .line 116
    .line 117
    add-int/2addr v0, v6

    .line 118
    goto :goto_0

    .line 119
    :cond_5
    new-instance p0, Ljava/io/EOFException;

    .line 120
    .line 121
    const-string p1, "Truncated Deflate64 Stream"

    .line 122
    .line 123
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_6
    return p3
.end method

.method public final x()I
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/bu1;->o:J

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/bu1;->n:J

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    return p0
.end method
