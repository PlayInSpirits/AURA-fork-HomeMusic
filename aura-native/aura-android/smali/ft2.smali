.class public final Lft2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ler2;


# instance fields
.field public final n:Lju1;

.field public final o:I


# direct methods
.method public constructor <init>(Lju1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lft2;->n:Lju1;

    .line 5
    .line 6
    iput p2, p0, Lft2;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(ILlk3;Lmi3;ZZ)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lft2;->o:I

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move v3, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v0

    .line 10
    :goto_0
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 11
    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    const/16 v3, 0x11

    .line 16
    .line 17
    invoke-virtual {p3, v3}, Lmi3;->a(I)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v3, v0

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    :goto_1
    move v3, v1

    .line 27
    :goto_2
    if-nez p5, :cond_3

    .line 28
    .line 29
    const/16 v4, 0x1e

    .line 30
    .line 31
    invoke-virtual {p3, v4}, Lmi3;->a(I)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_4

    .line 36
    .line 37
    :cond_3
    move v0, v1

    .line 38
    :cond_4
    const/4 v4, 0x2

    .line 39
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 40
    .line 41
    if-lt v2, v4, :cond_6

    .line 42
    .line 43
    invoke-virtual {p2, p3, p4, p5}, Llk3;->q(Lmi3;ZZ)Llk3;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    instance-of p3, p0, Lmm2;

    .line 48
    .line 49
    if-eqz p3, :cond_5

    .line 50
    .line 51
    new-instance p3, Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object p4, Llk3;->o0:Ljava/lang/String;

    .line 57
    .line 58
    new-instance p5, Lkk3;

    .line 59
    .line 60
    invoke-direct {p5, p2}, Lkk3;-><init>(Llk3;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3, p4, p5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_5
    invoke-virtual {p2, v2}, Llk3;->t(I)Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    :goto_3
    new-instance p2, Ljk3;

    .line 72
    .line 73
    new-instance p2, Landroid/os/Bundle;

    .line 74
    .line 75
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 76
    .line 77
    .line 78
    sget-object p4, Ljk3;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p2, p4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sget-object p4, Ljk3;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p2, p4, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0, p1, p3, p2}, Lju1;->I(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    invoke-virtual {p2, p3, p4, v1}, Llk3;->q(Lmi3;ZZ)Llk3;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2, v2}, Llk3;->t(I)Landroid/os/Bundle;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-interface {p0, p1, p2, v3}, Lju1;->u0(ILandroid/os/Bundle;Z)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final B(ILza4;ZZI)V
    .locals 0

    .line 1
    invoke-virtual {p2, p3, p4}, Lza4;->a(ZZ)Lza4;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2, p5}, Lza4;->c(I)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lju1;->C(ILandroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-static {p0}, Lau0;->k(Lju1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lju1;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lft2;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lft2;

    .line 17
    .line 18
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 19
    .line 20
    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p1, p1, Lft2;->n:Lju1;

    .line 25
    .line 26
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final i(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lju1;->i(III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Ljava/util/List;I)V
    .locals 3

    .line 1
    iget v0, p0, Lft2;->o:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 6
    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lyw1;->j()Luw1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge v2, v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lj60;

    .line 24
    .line 25
    invoke-virtual {v1}, Lj60;->o()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p0, p1, p2}, Lju1;->n(Ljava/util/List;I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const/4 v0, 0x1

    .line 44
    invoke-static {p1, v0, v0}, Lj60;->j(Ljava/util/List;ZZ)Lgy3;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {}, Lyw1;->j()Luw1;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :goto_1
    iget v1, p1, Lgy3;->q:I

    .line 53
    .line 54
    if-ge v2, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Lgy3;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lj60;

    .line 61
    .line 62
    invoke-virtual {v1}, Lj60;->o()Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p0, p1, p2}, Lju1;->s0(Ljava/util/List;I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final l(ILva4;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 4
    .line 5
    invoke-virtual {p2}, Lva4;->b()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p0, p1, p2, v0}, Lju1;->E(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(ILm92;)V
    .locals 7

    .line 1
    sget-object v0, Lm92;->j:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, Lm92;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p2, Lm92;->d:I

    .line 6
    .line 7
    new-instance v3, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v4, Lm92;->g:Ljava/lang/String;

    .line 13
    .line 14
    iget v5, p2, Lm92;->a:I

    .line 15
    .line 16
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sget-object v4, Lm92;->h:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v5, p2, Lm92;->b:J

    .line 22
    .line 23
    invoke-virtual {v3, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p2, Lm92;->e:Ljn2;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    sget-object v5, Lm92;->i:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljn2;->b()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p2, p2, Lm92;->f:Lxa4;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    sget-object v4, Lm92;->l:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p2}, Lxa4;->b()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {v3, v4, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object p2, Lm92;->k:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v3, p2, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 p2, 0x1

    .line 61
    if-eq v2, p2, :cond_6

    .line 62
    .line 63
    const/4 p2, 0x2

    .line 64
    const/4 v4, 0x0

    .line 65
    if-eq v2, p2, :cond_5

    .line 66
    .line 67
    const/4 p2, 0x3

    .line 68
    if-eq v2, p2, :cond_3

    .line 69
    .line 70
    const/4 p2, 0x4

    .line 71
    if-eq v2, p2, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    new-instance p2, Liw;

    .line 75
    .line 76
    check-cast v1, Lyw1;

    .line 77
    .line 78
    invoke-static {}, Lyw1;->j()Luw1;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    move v5, v4

    .line 83
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-ge v5, v6, :cond_4

    .line 88
    .line 89
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Lgn2;

    .line 94
    .line 95
    invoke-virtual {v6, v4}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v2, v6}, Lpw1;->c(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    invoke-virtual {v2}, Luw1;->f()Lgy3;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {p2, v1}, Liw;-><init>(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    check-cast v1, Lgn2;

    .line 117
    .line 118
    invoke-virtual {v1, v4}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 126
    .line 127
    invoke-interface {p0, p1, v3}, Lju1;->O(ILandroid/os/Bundle;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_6
    invoke-static {}, Ltb4;->a()V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final t(ILmi3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-virtual {p2}, Lmi3;->c()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p1, p2}, Lju1;->z(ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v(ILab4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 2
    .line 3
    invoke-virtual {p2}, Lab4;->b()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p1, p2}, Lju1;->I0(ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final z(ILjava/lang/String;Ljn2;)V
    .locals 1

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p3}, Ljn2;->b()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :goto_0
    iget-object p0, p0, Lft2;->n:Lju1;

    .line 10
    .line 11
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, p1, p2, v0, p3}, Lju1;->w0(ILjava/lang/String;ILandroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
