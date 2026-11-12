.class final Lw72;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Ldc3;

.field public final b:Lhg3;


# direct methods
.method public constructor <init>(Ldc3;Lhg3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw72;->a:Ldc3;

    .line 5
    .line 6
    iput-object p2, p0, Lw72;->b:Lhg3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 2

    .line 1
    new-instance v0, Lz72;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw72;->a:Ldc3;

    .line 7
    .line 8
    iput-object v1, v0, Lz72;->B:Ldc3;

    .line 9
    .line 10
    iget-object p0, p0, Lw72;->b:Lhg3;

    .line 11
    .line 12
    iput-object p0, v0, Lz72;->C:Lhg3;

    .line 13
    .line 14
    sget-object p0, Lhb3;->o:Lhb3;

    .line 15
    .line 16
    iput-object p0, v0, Lz72;->D:Lhb3;

    .line 17
    .line 18
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 1

    .line 1
    check-cast p1, Lz72;

    .line 2
    .line 3
    iget-object v0, p0, Lw72;->a:Ldc3;

    .line 4
    .line 5
    iput-object v0, p1, Lz72;->B:Ldc3;

    .line 6
    .line 7
    iget-object p0, p0, Lw72;->b:Lhg3;

    .line 8
    .line 9
    iput-object p0, p1, Lz72;->C:Lhg3;

    .line 10
    .line 11
    sget-object p0, Lhb3;->o:Lhb3;

    .line 12
    .line 13
    iput-object p0, p1, Lz72;->D:Lhb3;

    .line 14
    .line 15
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
    instance-of v1, p1, Lw72;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lw72;

    .line 11
    .line 12
    iget-object v1, p1, Lw72;->a:Ldc3;

    .line 13
    .line 14
    iget-object v2, p0, Lw72;->a:Ldc3;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object p0, p0, Lw72;->b:Lhg3;

    .line 24
    .line 25
    iget-object p1, p1, Lw72;->b:Lhg3;

    .line 26
    .line 27
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lw72;->a:Ldc3;

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
    iget-object p0, p0, Lw72;->b:Lhg3;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v0

    .line 17
    mul-int/2addr p0, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {p0, v1, v0}, Lxa3;->c(IIZ)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    sget-object v0, Lhb3;->o:Lhb3;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/2addr v0, p0

    .line 30
    return v0
.end method
