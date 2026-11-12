.class public final Lx20;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lx20;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lsa0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lx20;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ljava/lang/Object;

    .line 4
    .line 5
    iget v1, p0, Lx20;->b:I

    .line 6
    .line 7
    aput-object p1, v0, v1

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iget p1, p0, Lx20;->c:I

    .line 12
    .line 13
    and-int/2addr p1, v1

    .line 14
    iput p1, p0, Lx20;->b:I

    .line 15
    .line 16
    iget v1, p0, Lx20;->a:I

    .line 17
    .line 18
    if-ne p1, v1, :cond_1

    .line 19
    .line 20
    array-length p1, v0

    .line 21
    sub-int v2, p1, v1

    .line 22
    .line 23
    shl-int/lit8 v3, p1, 0x1

    .line 24
    .line 25
    if-ltz v3, :cond_0

    .line 26
    .line 27
    new-array v4, v3, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-static {v5, v1, p1, v0, v4}, Lti;->Z(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lx20;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [Ljava/lang/Object;

    .line 36
    .line 37
    iget v1, p0, Lx20;->a:I

    .line 38
    .line 39
    invoke-static {v2, v5, v1, v0, v4}, Lti;->Z(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, Lx20;->d:Ljava/lang/Object;

    .line 43
    .line 44
    iput v5, p0, Lx20;->a:I

    .line 45
    .line 46
    iput p1, p0, Lx20;->b:I

    .line 47
    .line 48
    add-int/lit8 v3, v3, -0x1

    .line 49
    .line 50
    iput v3, p0, Lx20;->c:I

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p0, "Max array capacity exceeded"

    .line 54
    .line 55
    invoke-static {p0}, Ltb4;->e(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public b()Lhp0;
    .locals 2

    .line 1
    iget v0, p0, Lx20;->b:I

    .line 2
    .line 3
    iget v1, p0, Lx20;->c:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lhp0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lhp0;-><init>(Lx20;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public c(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lx20;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lya3;

    .line 4
    .line 5
    iget-object v0, v0, Lya3;->f:[I

    .line 6
    .line 7
    iget p0, p0, Lx20;->b:I

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    aget p0, v0, p0

    .line 11
    .line 12
    return p0
.end method

.method public d(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx20;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lya3;

    .line 4
    .line 5
    iget-object v0, v0, Lya3;->h:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p0, p0, Lx20;->c:I

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    aget-object p0, v0, p0

    .line 11
    .line 12
    return-object p0
.end method
