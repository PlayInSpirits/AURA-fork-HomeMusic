.class public final Ldefpackage/ms4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/ls4;

.field public final b:Ldefpackage/fd;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ldefpackage/ls4;Ldefpackage/fd;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ms4;->a:Ldefpackage/ls4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 7
    .line 8
    iput-wide p3, p0, Ldefpackage/ms4;->c:J

    .line 9
    .line 10
    iget-object p1, p2, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    const/4 p4, 0x0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    move p3, p4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p3, 0x0

    .line 24
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ldefpackage/od3;

    .line 29
    .line 30
    iget-object v0, v0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 31
    .line 32
    iget-object v0, v0, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 33
    .line 34
    invoke-virtual {v0, p3}, Ldefpackage/ks4;->c(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p3, p4

    .line 39
    :goto_0
    iput p3, p0, Ldefpackage/ms4;->d:F

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {p1}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ldefpackage/od3;

    .line 53
    .line 54
    iget-object p3, p1, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 55
    .line 56
    iget-object p3, p3, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 57
    .line 58
    iget v0, p3, Ldefpackage/ks4;->f:I

    .line 59
    .line 60
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    invoke-virtual {p3, v0}, Ldefpackage/ks4;->c(I)F

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    add-float/2addr p3, p4

    .line 67
    iget p1, p1, Ldefpackage/od3;->f:F

    .line 68
    .line 69
    add-float p4, p3, p1

    .line 70
    .line 71
    :goto_1
    iput p4, p0, Ldefpackage/ms4;->e:F

    .line 72
    .line 73
    iget-object p1, p2, Ldefpackage/fd;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Ljava/util/ArrayList;

    .line 76
    .line 77
    iput-object p1, p0, Ldefpackage/ms4;->f:Ljava/util/ArrayList;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/bq4;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/he;

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-lt p1, p0, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Ldefpackage/gb;->E(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez p1, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0, p1}, Ldefpackage/rr2;->C(Ljava/util/List;I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ldefpackage/od3;

    .line 41
    .line 42
    iget-object v0, p0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ldefpackage/od3;->a(I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-object v0, v0, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ldefpackage/ks4;->f(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget p0, p0, Ldefpackage/od3;->d:I

    .line 55
    .line 56
    add-int/2addr p1, p0

    .line 57
    return p1
.end method

.method public final b(F)I
    .locals 8

    .line 1
    iget-object p0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpg-float v1, p1, v0

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    invoke-static {p0}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ldefpackage/od3;

    .line 21
    .line 22
    iget v1, v1, Ldefpackage/od3;->g:F

    .line 23
    .line 24
    cmpl-float v1, p1, v1

    .line 25
    .line 26
    if-ltz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sub-int/2addr v1, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sub-int/2addr v1, v3

    .line 39
    move v4, v2

    .line 40
    :goto_0
    if-gt v4, v1, :cond_6

    .line 41
    .line 42
    add-int v5, v4, v1

    .line 43
    .line 44
    ushr-int/2addr v5, v3

    .line 45
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Ldefpackage/od3;

    .line 50
    .line 51
    iget v7, v6, Ldefpackage/od3;->f:F

    .line 52
    .line 53
    cmpl-float v7, v7, p1

    .line 54
    .line 55
    if-lez v7, :cond_2

    .line 56
    .line 57
    move v6, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget v6, v6, Ldefpackage/od3;->g:F

    .line 60
    .line 61
    cmpg-float v6, v6, p1

    .line 62
    .line 63
    if-gtz v6, :cond_3

    .line 64
    .line 65
    const/4 v6, -0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v6, v2

    .line 68
    :goto_1
    if-gez v6, :cond_4

    .line 69
    .line 70
    add-int/lit8 v4, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    if-lez v6, :cond_5

    .line 74
    .line 75
    add-int/lit8 v1, v5, -0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    move v1, v5

    .line 79
    goto :goto_2

    .line 80
    :cond_6
    add-int/2addr v4, v3

    .line 81
    neg-int v1, v4

    .line 82
    :goto_2
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Ldefpackage/od3;

    .line 87
    .line 88
    iget v1, p0, Ldefpackage/od3;->c:I

    .line 89
    .line 90
    iget v4, p0, Ldefpackage/od3;->d:I

    .line 91
    .line 92
    iget v5, p0, Ldefpackage/od3;->b:I

    .line 93
    .line 94
    sub-int/2addr v1, v5

    .line 95
    if-nez v1, :cond_7

    .line 96
    .line 97
    return v4

    .line 98
    :cond_7
    iget-object v1, p0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 99
    .line 100
    iget p0, p0, Ldefpackage/od3;->f:F

    .line 101
    .line 102
    sub-float/2addr p1, p0

    .line 103
    iget-object p0, v1, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 104
    .line 105
    sub-float/2addr p1, v0

    .line 106
    float-to-int p1, p1

    .line 107
    iget v0, p0, Ldefpackage/ks4;->f:I

    .line 108
    .line 109
    if-gtz v0, :cond_8

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_8
    iget-object v1, p0, Ldefpackage/ks4;->e:Landroid/text/Layout;

    .line 113
    .line 114
    iget p0, p0, Ldefpackage/ks4;->g:I

    .line 115
    .line 116
    sub-int/2addr p1, p0

    .line 117
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    add-int/lit8 p0, v0, -0x1

    .line 122
    .line 123
    if-le v2, p0, :cond_9

    .line 124
    .line 125
    move v2, p0

    .line 126
    :cond_9
    :goto_3
    add-int/2addr v2, v4

    .line 127
    return v2
.end method

.method public final c(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/fd;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/rr2;->D(Ljava/util/List;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ldefpackage/od3;

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 21
    .line 22
    iget v1, p0, Ldefpackage/od3;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 26
    .line 27
    iget-object v0, v0, Ldefpackage/ks4;->e:Landroid/text/Layout;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineStart(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget p0, p0, Ldefpackage/od3;->b:I

    .line 34
    .line 35
    add-int/2addr p1, p0

    .line 36
    return p1
.end method

.method public final d(I)F
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/fd;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/rr2;->D(Ljava/util/List;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ldefpackage/od3;

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 21
    .line 22
    iget v1, p0, Ldefpackage/od3;->d:I

    .line 23
    .line 24
    sub-int/2addr p1, v1

    .line 25
    iget-object v0, v0, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ldefpackage/ks4;->g(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p0, p0, Ldefpackage/od3;->f:F

    .line 32
    .line 33
    add-float/2addr p1, p0

    .line 34
    return p1
.end method

.method public final e(I)Ldefpackage/o04;
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ldefpackage/bq4;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/he;

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gt p1, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "offset("

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, ") is out of bounds [0, "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "]"

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object v0, p0, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ldefpackage/bq4;

    .line 61
    .line 62
    iget-object v0, v0, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ldefpackage/he;

    .line 65
    .line 66
    iget-object v0, v0, Ldefpackage/he;->o:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/util/ArrayList;

    .line 75
    .line 76
    if-ne p1, v0, :cond_1

    .line 77
    .line 78
    invoke-static {p0}, Ldefpackage/gb;->E(Ljava/util/List;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-static {p0, p1}, Ldefpackage/rr2;->C(Ljava/util/List;I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Ldefpackage/od3;

    .line 92
    .line 93
    iget-object v0, p0, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Ldefpackage/od3;->a(I)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    iget-object p1, v0, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 100
    .line 101
    invoke-virtual {p1, p0}, Ldefpackage/ks4;->f(I)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    iget-object p1, p1, Ldefpackage/ks4;->e:Landroid/text/Layout;

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    const/4 p1, 0x1

    .line 112
    if-ne p0, p1, :cond_2

    .line 113
    .line 114
    sget-object p0, Ldefpackage/o04;->n:Ldefpackage/o04;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_2
    sget-object p0, Ldefpackage/o04;->o:Ldefpackage/o04;

    .line 118
    .line 119
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ldefpackage/ms4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    check-cast p1, Ldefpackage/ms4;

    .line 11
    .line 12
    iget-object v0, p1, Ldefpackage/ms4;->a:Ldefpackage/ls4;

    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/ms4;->a:Ldefpackage/ls4;

    .line 15
    .line 16
    invoke-static {v2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget-object v0, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 24
    .line 25
    iget-object v2, p1, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 26
    .line 27
    if-eq v0, v2, :cond_3

    .line 28
    .line 29
    return v1

    .line 30
    :cond_3
    iget-wide v2, p0, Ldefpackage/ms4;->c:J

    .line 31
    .line 32
    iget-wide v4, p1, Ldefpackage/ms4;->c:J

    .line 33
    .line 34
    invoke-static {v2, v3, v4, v5}, Ldefpackage/n02;->a(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_4
    iget v0, p0, Ldefpackage/ms4;->d:F

    .line 42
    .line 43
    iget v2, p1, Ldefpackage/ms4;->d:F

    .line 44
    .line 45
    cmpg-float v0, v0, v2

    .line 46
    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    iget v0, p0, Ldefpackage/ms4;->e:F

    .line 50
    .line 51
    iget v2, p1, Ldefpackage/ms4;->e:F

    .line 52
    .line 53
    cmpg-float v0, v0, v2

    .line 54
    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    iget-object p0, p0, Ldefpackage/ms4;->f:Ljava/util/ArrayList;

    .line 58
    .line 59
    iget-object p1, p1, Ldefpackage/ms4;->f:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_5

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    :goto_0
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_6
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ms4;->a:Ldefpackage/ls4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ls4;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, Ldefpackage/ms4;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, Ldefpackage/xa3;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Ldefpackage/ms4;->d:F

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Ldefpackage/b11;->d(IFI)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, Ldefpackage/ms4;->e:F

    .line 31
    .line 32
    invoke-static {v0, v2, v1}, Ldefpackage/b11;->d(IFI)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Ldefpackage/ms4;->f:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Ldefpackage/ms4;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ldefpackage/n02;->b(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "TextLayoutResult(layoutInput="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Ldefpackage/ms4;->a:Ldefpackage/ls4;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", multiParagraph="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Ldefpackage/ms4;->b:Ldefpackage/fd;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", size="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", firstBaseline="

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v0, p0, Ldefpackage/ms4;->d:F

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", lastBaseline="

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget v0, p0, Ldefpackage/ms4;->e:F

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", placeholderRects="

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Ldefpackage/ms4;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p0, ")"

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
