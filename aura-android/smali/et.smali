.class final Let;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Lif1;


# direct methods
.method public constructor <init>(Lif1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Let;->a:Lif1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 1

    .line 1
    new-instance v0, Lft;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Let;->a:Lif1;

    .line 7
    .line 8
    iput-object p0, v0, Lft;->B:Lif1;

    .line 9
    .line 10
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 1

    .line 1
    check-cast p1, Lft;

    .line 2
    .line 3
    iget-object p0, p0, Let;->a:Lif1;

    .line 4
    .line 5
    iput-object p0, p1, Lft;->B:Lif1;

    .line 6
    .line 7
    iget-object v0, p1, Lcx2;->n:Lcx2;

    .line 8
    .line 9
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x2

    .line 15
    invoke-static {p1, v0}, Lj51;->M(Leo0;I)Lf63;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, Lf63;->I:Lf63;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p0, v0}, Lf63;->Y0(Lif1;Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
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
    instance-of v1, p1, Let;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Let;

    .line 12
    .line 13
    iget-object p1, p1, Let;->a:Lif1;

    .line 14
    .line 15
    iget-object p0, p0, Let;->a:Lif1;

    .line 16
    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Let;->a:Lif1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
