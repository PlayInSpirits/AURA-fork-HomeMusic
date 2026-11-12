.class final Lt82;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Lgf1;

.field public final b:Ls82;

.field public final c:Z


# direct methods
.method public constructor <init>(Lgf1;Ls82;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt82;->a:Lgf1;

    .line 5
    .line 6
    iput-object p2, p0, Lt82;->b:Ls82;

    .line 7
    .line 8
    iput-boolean p3, p0, Lt82;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 3

    .line 1
    new-instance v0, Lx82;

    .line 2
    .line 3
    iget-object v1, p0, Lt82;->b:Ls82;

    .line 4
    .line 5
    iget-boolean v2, p0, Lt82;->c:Z

    .line 6
    .line 7
    iget-object p0, p0, Lt82;->a:Lgf1;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lx82;-><init>(Lgf1;Ls82;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 1

    .line 1
    check-cast p1, Lx82;

    .line 2
    .line 3
    iget-object v0, p0, Lt82;->a:Lgf1;

    .line 4
    .line 5
    iput-object v0, p1, Lx82;->B:Lgf1;

    .line 6
    .line 7
    iget-object v0, p0, Lt82;->b:Ls82;

    .line 8
    .line 9
    iput-object v0, p1, Lx82;->C:Ls82;

    .line 10
    .line 11
    iget-boolean v0, p1, Lx82;->D:Z

    .line 12
    .line 13
    iget-boolean p0, p0, Lt82;->c:Z

    .line 14
    .line 15
    if-ne v0, p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput-boolean p0, p1, Lx82;->D:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Lx82;->q0()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lfu;->C(Lg94;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lt82;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lt82;

    .line 11
    .line 12
    iget-object v1, p1, Lt82;->a:Lgf1;

    .line 13
    .line 14
    iget-object v2, p0, Lt82;->a:Lgf1;

    .line 15
    .line 16
    if-eq v2, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v1, p0, Lt82;->b:Ls82;

    .line 20
    .line 21
    iget-object v2, p1, Lt82;->b:Ls82;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-boolean p0, p0, Lt82;->c:Z

    .line 31
    .line 32
    iget-boolean p1, p1, Lt82;->c:Z

    .line 33
    .line 34
    if-eq p0, p1, :cond_4

    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lt82;->a:Lgf1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lt82;->b:Ls82;

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
    sget-object v0, Lhb3;->o:Lhb3;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean p0, p0, Lt82;->c:Z

    .line 27
    .line 28
    invoke-static {v0, v1, p0}, Lxa3;->c(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, p0

    .line 38
    return v0
.end method
