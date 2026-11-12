.class public final Lh6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public final a:Li6;

.field public final b:Lbe3;

.field public final c:Lbe3;

.field public final d:Lh00;

.field public e:Lm51;

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Li6;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "audio/mp4a-latm"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {p1, v0, v1, v2, v3}, Li6;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lh6;->a:Li6;

    .line 15
    .line 16
    new-instance p1, Lbe3;

    .line 17
    .line 18
    const/16 v0, 0x800

    .line 19
    .line 20
    invoke-direct {p1, v0}, Lbe3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lh6;->b:Lbe3;

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    iput-wide v0, p0, Lh6;->g:J

    .line 28
    .line 29
    new-instance p1, Lbe3;

    .line 30
    .line 31
    const/16 v0, 0xa

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lbe3;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lh6;->c:Lbe3;

    .line 37
    .line 38
    new-instance v0, Lh00;

    .line 39
    .line 40
    iget-object p1, p1, Lbe3;->a:[B

    .line 41
    .line 42
    array-length v1, p1

    .line 43
    invoke-direct {v0, v1, p1}, Lh00;-><init>(I[B)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lh6;->d:Lh00;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 8

    .line 1
    iget-object p2, p0, Lh6;->e:Lm51;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ll51;->getLength()J

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lh6;->b:Lbe3;

    .line 10
    .line 11
    iget-object v0, p2, Lbe3;->a:[B

    .line 12
    .line 13
    const/16 v1, 0x800

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {p1, v0, v2, v1}, Lwh0;->read([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v0, -0x1

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    move v3, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v2

    .line 27
    :goto_0
    iget-boolean v4, p0, Lh6;->i:Z

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget-object v4, p0, Lh6;->e:Lm51;

    .line 33
    .line 34
    new-instance v5, Lbo;

    .line 35
    .line 36
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-direct {v5, v6, v7}, Lbo;-><init>(J)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v4, v5}, Lm51;->w(Lm84;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v1, p0, Lh6;->i:Z

    .line 48
    .line 49
    :goto_1
    if-eqz v3, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_2
    invoke-virtual {p2, v2}, Lbe3;->N(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lbe3;->M(I)V

    .line 56
    .line 57
    .line 58
    iget-boolean p1, p0, Lh6;->h:Z

    .line 59
    .line 60
    iget-object v0, p0, Lh6;->a:Li6;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    iget-wide v3, p0, Lh6;->f:J

    .line 65
    .line 66
    iput-wide v3, v0, Li6;->u:J

    .line 67
    .line 68
    iput-boolean v1, p0, Lh6;->h:Z

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v0, p2}, Li6;->a(Lbe3;)V

    .line 71
    .line 72
    .line 73
    return v2
.end method

.method public final c(Ll51;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lh6;->c:Lbe3;

    .line 4
    .line 5
    iget-object v3, v2, Lbe3;->a:[B

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    invoke-interface {p1, v3, v0, v4}, Ll51;->n([BII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lbe3;->N(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lbe3;->D()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x494433

    .line 20
    .line 21
    .line 22
    if-eq v3, v4, :cond_5

    .line 23
    .line 24
    invoke-interface {p1}, Ll51;->k()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1}, Ll51;->g(I)V

    .line 28
    .line 29
    .line 30
    iget-wide v3, p0, Lh6;->g:J

    .line 31
    .line 32
    const-wide/16 v5, -0x1

    .line 33
    .line 34
    cmp-long v3, v3, v5

    .line 35
    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    int-to-long v3, v1

    .line 39
    iput-wide v3, p0, Lh6;->g:J

    .line 40
    .line 41
    :cond_0
    move v3, v0

    .line 42
    move v5, v3

    .line 43
    move v4, v1

    .line 44
    :cond_1
    iget-object v6, v2, Lbe3;->a:[B

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, Lrk0;

    .line 48
    .line 49
    const/4 v8, 0x2

    .line 50
    invoke-virtual {v7, v6, v0, v8, v0}, Lrk0;->e([BIIZ)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lbe3;->N(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lbe3;->H()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const v8, 0xfff6

    .line 61
    .line 62
    .line 63
    and-int/2addr v6, v8

    .line 64
    const v8, 0xfff0

    .line 65
    .line 66
    .line 67
    if-ne v6, v8, :cond_4

    .line 68
    .line 69
    const/4 v6, 0x1

    .line 70
    add-int/2addr v3, v6

    .line 71
    const/4 v8, 0x4

    .line 72
    if-lt v3, v8, :cond_2

    .line 73
    .line 74
    const/16 v9, 0xbc

    .line 75
    .line 76
    if-le v5, v9, :cond_2

    .line 77
    .line 78
    return v6

    .line 79
    :cond_2
    iget-object v6, v2, Lbe3;->a:[B

    .line 80
    .line 81
    invoke-virtual {v7, v6, v0, v8, v0}, Lrk0;->e([BIIZ)Z

    .line 82
    .line 83
    .line 84
    const/16 v6, 0xe

    .line 85
    .line 86
    iget-object v8, p0, Lh6;->d:Lh00;

    .line 87
    .line 88
    invoke-virtual {v8, v6}, Lh00;->q(I)V

    .line 89
    .line 90
    .line 91
    const/16 v6, 0xd

    .line 92
    .line 93
    invoke-virtual {v8, v6}, Lh00;->i(I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    const/4 v8, 0x6

    .line 98
    if-gt v6, v8, :cond_3

    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    iput v0, v7, Lrk0;->s:I

    .line 103
    .line 104
    invoke-virtual {v7, v4, v0}, Lrk0;->o(IZ)Z

    .line 105
    .line 106
    .line 107
    :goto_1
    move v3, v0

    .line 108
    move v5, v3

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    add-int/lit8 v8, v6, -0x6

    .line 111
    .line 112
    invoke-virtual {v7, v8, v0}, Lrk0;->o(IZ)Z

    .line 113
    .line 114
    .line 115
    add-int/2addr v5, v6

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    iput v0, v7, Lrk0;->s:I

    .line 120
    .line 121
    invoke-virtual {v7, v4, v0}, Lrk0;->o(IZ)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :goto_2
    sub-int v6, v4, v1

    .line 126
    .line 127
    const/16 v7, 0x2000

    .line 128
    .line 129
    if-lt v6, v7, :cond_1

    .line 130
    .line 131
    return v0

    .line 132
    :cond_5
    const/4 v3, 0x3

    .line 133
    invoke-virtual {v2, v3}, Lbe3;->O(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lbe3;->z()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/lit8 v3, v2, 0xa

    .line 141
    .line 142
    add-int/2addr v1, v3

    .line 143
    invoke-interface {p1, v2}, Ll51;->g(I)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0
.end method

.method public final d(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lh6;->h:Z

    .line 3
    .line 4
    iget-object p1, p0, Lh6;->a:Li6;

    .line 5
    .line 6
    invoke-virtual {p1}, Li6;->c()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lh6;->f:J

    .line 10
    .line 11
    return-void
.end method

.method public final f(Lm51;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lh6;->e:Lm51;

    .line 2
    .line 3
    new-instance v0, Lsy4;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-direct {v0, v1, v2}, Lsy4;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lh6;->a:Li6;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Li6;->f(Lm51;Lsy4;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lm51;->p()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
