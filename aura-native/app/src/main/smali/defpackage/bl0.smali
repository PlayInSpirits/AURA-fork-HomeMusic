.class public final Ldefpackage/bl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/bi0;


# instance fields
.field public n:I

.field public o:I

.field public p:Z

.field public final q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ldefpackage/qr2;

    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-direct {p1, v0}, Ldefpackage/qr2;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 15
    .line 16
    const/16 p1, 0x1f40

    .line 17
    .line 18
    iput p1, p0, Ldefpackage/bl0;->n:I

    .line 19
    .line 20
    iput p1, p0, Ldefpackage/bl0;->o:I

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance p1, Ldefpackage/k83;

    .line 27
    .line 28
    invoke-direct {p1}, Ldefpackage/k83;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance p1, Ldefpackage/be3;

    .line 34
    .line 35
    const v0, 0xfe01

    .line 36
    .line 37
    .line 38
    new-array v0, v0, [B

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, v1, v0}, Ldefpackage/be3;-><init>(I[B)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/bl0;->r:Ljava/lang/Object;

    .line 45
    .line 46
    const/4 p1, -0x1

    .line 47
    iput p1, p0, Ldefpackage/bl0;->n:I

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(I)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/bl0;->o:I

    .line 3
    .line 4
    :cond_0
    iget v1, p0, Ldefpackage/bl0;->o:I

    .line 5
    .line 6
    add-int v2, p1, v1

    .line 7
    .line 8
    iget-object v3, p0, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, Ldefpackage/k83;

    .line 11
    .line 12
    iget v4, v3, Ldefpackage/k83;->c:I

    .line 13
    .line 14
    if-ge v2, v4, :cond_1

    .line 15
    .line 16
    iget-object v3, v3, Ldefpackage/k83;->f:[I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iput v1, p0, Ldefpackage/bl0;->o:I

    .line 21
    .line 22
    aget v1, v3, v2

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    const/16 v2, 0xff

    .line 26
    .line 27
    if-eq v1, v2, :cond_0

    .line 28
    .line 29
    :cond_1
    return v0
.end method

.method public b(Ldefpackage/l51;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/k83;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/bl0;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/be3;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    move v4, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v3

    .line 16
    :goto_0
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean v4, p0, Ldefpackage/bl0;->p:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iput-boolean v3, p0, Ldefpackage/bl0;->p:Z

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ldefpackage/be3;->K(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_1
    iget-boolean v4, p0, Ldefpackage/bl0;->p:Z

    .line 29
    .line 30
    if-nez v4, :cond_9

    .line 31
    .line 32
    iget v4, p0, Ldefpackage/bl0;->n:I

    .line 33
    .line 34
    if-gez v4, :cond_5

    .line 35
    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, p1, v4, v5}, Ldefpackage/k83;->b(Ldefpackage/l51;J)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Ldefpackage/k83;->a(Ldefpackage/l51;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    iget v4, v0, Ldefpackage/k83;->d:I

    .line 52
    .line 53
    iget v5, v0, Ldefpackage/k83;->a:I

    .line 54
    .line 55
    and-int/2addr v5, v2

    .line 56
    if-ne v5, v2, :cond_3

    .line 57
    .line 58
    iget v5, v1, Ldefpackage/be3;->c:I

    .line 59
    .line 60
    if-nez v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Ldefpackage/bl0;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    add-int/2addr v4, v5

    .line 67
    iget v5, p0, Ldefpackage/bl0;->o:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v5, v3

    .line 71
    :goto_2
    :try_start_0
    invoke-interface {p1, v4}, Ldefpackage/l51;->l(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    iput v5, p0, Ldefpackage/bl0;->n:I

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :catch_0
    :cond_4
    :goto_3
    return v3

    .line 78
    :cond_5
    :goto_4
    iget v4, p0, Ldefpackage/bl0;->n:I

    .line 79
    .line 80
    invoke-virtual {p0, v4}, Ldefpackage/bl0;->a(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget v5, p0, Ldefpackage/bl0;->n:I

    .line 85
    .line 86
    iget v6, p0, Ldefpackage/bl0;->o:I

    .line 87
    .line 88
    add-int/2addr v5, v6

    .line 89
    if-lez v4, :cond_7

    .line 90
    .line 91
    iget v6, v1, Ldefpackage/be3;->c:I

    .line 92
    .line 93
    add-int/2addr v6, v4

    .line 94
    invoke-virtual {v1, v6}, Ldefpackage/be3;->c(I)V

    .line 95
    .line 96
    .line 97
    iget-object v6, v1, Ldefpackage/be3;->a:[B

    .line 98
    .line 99
    iget v7, v1, Ldefpackage/be3;->c:I

    .line 100
    .line 101
    :try_start_1
    invoke-interface {p1, v6, v7, v4}, Ldefpackage/l51;->readFully([BII)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 102
    .line 103
    .line 104
    iget v6, v1, Ldefpackage/be3;->c:I

    .line 105
    .line 106
    add-int/2addr v6, v4

    .line 107
    invoke-virtual {v1, v6}, Ldefpackage/be3;->M(I)V

    .line 108
    .line 109
    .line 110
    iget-object v4, v0, Ldefpackage/k83;->f:[I

    .line 111
    .line 112
    add-int/lit8 v6, v5, -0x1

    .line 113
    .line 114
    aget v4, v4, v6

    .line 115
    .line 116
    const/16 v6, 0xff

    .line 117
    .line 118
    if-eq v4, v6, :cond_6

    .line 119
    .line 120
    move v4, v2

    .line 121
    goto :goto_5

    .line 122
    :cond_6
    move v4, v3

    .line 123
    :goto_5
    iput-boolean v4, p0, Ldefpackage/bl0;->p:Z

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :catch_1
    return v3

    .line 127
    :cond_7
    :goto_6
    iget v4, v0, Ldefpackage/k83;->c:I

    .line 128
    .line 129
    if-ne v5, v4, :cond_8

    .line 130
    .line 131
    const/4 v5, -0x1

    .line 132
    :cond_8
    iput v5, p0, Ldefpackage/bl0;->n:I

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_9
    return v2
.end method

.method public m()Ldefpackage/ci0;
    .locals 5

    .line 1
    new-instance v0, Ldefpackage/el0;

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/bl0;->n:I

    .line 4
    .line 5
    iget v2, p0, Ldefpackage/bl0;->o:I

    .line 6
    .line 7
    iget-boolean v3, p0, Ldefpackage/bl0;->p:Z

    .line 8
    .line 9
    iget-object v4, p0, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Ldefpackage/qr2;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Ldefpackage/el0;-><init>(IIZLdefpackage/qr2;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/bl0;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/rw4;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ldefpackage/kp;->c(Ldefpackage/rw4;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object v0
.end method
