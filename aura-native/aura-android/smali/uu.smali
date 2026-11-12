.class public final Luu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lsu;


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Ljava/lang/Object;


# virtual methods
.method public a()J
    .locals 5

    .line 1
    iget v0, p0, Luu;->p:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Luu;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    iget v2, p0, Luu;->n:I

    .line 10
    .line 11
    aget-wide v3, v1, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iget v1, p0, Luu;->q:I

    .line 16
    .line 17
    and-int/2addr v1, v2

    .line 18
    iput v1, p0, Luu;->n:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    iput v0, p0, Luu;->p:I

    .line 23
    .line 24
    return-wide v3

    .line 25
    :cond_0
    invoke-static {}, Ltb4;->k()V

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    return-wide v0
.end method

.method public f()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public k()I
    .locals 0

    .line 1
    iget p0, p0, Luu;->n:I

    .line 2
    .line 3
    return p0
.end method

.method public l()I
    .locals 3

    .line 1
    iget-object v0, p0, Luu;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbe3;

    .line 4
    .line 5
    iget v1, p0, Luu;->o:I

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lbe3;->A()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/16 v2, 0x10

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lbe3;->H()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    iget v1, p0, Luu;->p:I

    .line 26
    .line 27
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    iput v2, p0, Luu;->p:I

    .line 30
    .line 31
    rem-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lbe3;->A()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Luu;->q:I

    .line 40
    .line 41
    and-int/lit16 p0, v0, 0xf0

    .line 42
    .line 43
    shr-int/lit8 p0, p0, 0x4

    .line 44
    .line 45
    return p0

    .line 46
    :cond_2
    iget p0, p0, Luu;->q:I

    .line 47
    .line 48
    and-int/lit8 p0, p0, 0xf

    .line 49
    .line 50
    return p0
.end method
