.class final Lb53;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Ly43;


# direct methods
.method public constructor <init>(Ly43;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb53;->a:Ly43;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 2

    .line 1
    new-instance v0, Le53;

    .line 2
    .line 3
    iget-object p0, p0, Lb53;->a:Ly43;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Le53;-><init>(Ly43;Lna4;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 2

    .line 1
    check-cast p1, Le53;

    .line 2
    .line 3
    iget-object p0, p0, Lb53;->a:Ly43;

    .line 4
    .line 5
    iput-object p0, p1, Le53;->B:Ly43;

    .line 6
    .line 7
    iget-object p0, p1, Le53;->C:Lna4;

    .line 8
    .line 9
    iget-object v0, p0, Lna4;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Le53;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Lna4;->n:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v1, p0, Lna4;->q:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v0, Lgb;->c:Lrd2;

    .line 21
    .line 22
    iput-object v0, p0, Lna4;->p:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    new-instance p0, Lna4;

    .line 25
    .line 26
    const/16 v0, 0xa

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lna4;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p0, p1, Le53;->C:Lna4;

    .line 32
    .line 33
    iget-boolean v0, p1, Lcx2;->A:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iput-object p1, p0, Lna4;->n:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v1, p0, Lna4;->o:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, p1, Le53;->D:Le53;

    .line 42
    .line 43
    new-instance v0, Lwc;

    .line 44
    .line 45
    const/16 v1, 0xf

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lna4;->p:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcx2;->e0()Lwe0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lna4;->q:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lb53;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lb53;

    .line 7
    .line 8
    iget-object p1, p1, Lb53;->a:Ly43;

    .line 9
    .line 10
    iget-object p0, p0, Lb53;->a:Ly43;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lb53;->a:Ly43;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    return p0
.end method
