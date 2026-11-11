.class public final Lq60;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public final synthetic q:Lr60;


# direct methods
.method public constructor <init>(Lr60;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq60;->q:Lr60;

    .line 5
    .line 6
    iget v0, p1, Lr60;->q:I

    .line 7
    .line 8
    iput v0, p0, Lq60;->n:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lr60;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, -0x1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    move p1, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput p1, p0, Lq60;->o:I

    .line 21
    .line 22
    iput v0, p0, Lq60;->p:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget p0, p0, Lq60;->o:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lq60;->q:Lr60;

    .line 2
    .line 3
    iget v1, v0, Lr60;->q:I

    .line 4
    .line 5
    iget v2, p0, Lq60;->n:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Lq60;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lq60;->o:I

    .line 17
    .line 18
    iput v1, p0, Lq60;->p:I

    .line 19
    .line 20
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aget-object v1, v2, v1

    .line 25
    .line 26
    iget v2, p0, Lq60;->o:I

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    iget v0, v0, Lr60;->r:I

    .line 31
    .line 32
    if-ge v2, v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v2, -0x1

    .line 36
    :goto_0
    iput v2, p0, Lq60;->o:I

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    invoke-static {}, Ltb4;->k()V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_2
    invoke-static {}, Lkf2;->c()V

    .line 44
    .line 45
    .line 46
    return-object v3
.end method

.method public final remove()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq60;->q:Lr60;

    .line 2
    .line 3
    iget v1, v0, Lr60;->q:I

    .line 4
    .line 5
    iget v2, p0, Lq60;->n:I

    .line 6
    .line 7
    if-ne v1, v2, :cond_1

    .line 8
    .line 9
    iget v1, p0, Lq60;->p:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    const-string v3, "no calls to next() since the last call to remove()"

    .line 18
    .line 19
    invoke-static {v3, v1}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lq60;->n:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x20

    .line 25
    .line 26
    iput v1, p0, Lq60;->n:I

    .line 27
    .line 28
    iget v1, p0, Lq60;->p:I

    .line 29
    .line 30
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    aget-object v1, v3, v1

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lr60;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lq60;->o:I

    .line 40
    .line 41
    sub-int/2addr v0, v2

    .line 42
    iput v0, p0, Lq60;->o:I

    .line 43
    .line 44
    const/4 v0, -0x1

    .line 45
    iput v0, p0, Lq60;->p:I

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {}, Lkf2;->c()V

    .line 49
    .line 50
    .line 51
    return-void
.end method
