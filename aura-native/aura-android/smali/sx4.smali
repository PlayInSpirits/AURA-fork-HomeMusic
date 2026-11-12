.class final Lsx4;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Lq82;


# direct methods
.method public constructor <init>(Lq82;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsx4;->a:Lq82;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 1

    .line 1
    new-instance v0, Ltx4;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lsx4;->a:Lq82;

    .line 7
    .line 8
    iput-object p0, v0, Ltx4;->B:Lq82;

    .line 9
    .line 10
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 0

    .line 1
    check-cast p1, Ltx4;

    .line 2
    .line 3
    iget-object p0, p0, Lsx4;->a:Lq82;

    .line 4
    .line 5
    iput-object p0, p1, Ltx4;->B:Lq82;

    .line 6
    .line 7
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
    instance-of v1, p1, Lsx4;

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
    check-cast p1, Lsx4;

    .line 12
    .line 13
    iget-object p0, p0, Lsx4;->a:Lq82;

    .line 14
    .line 15
    iget-object p1, p1, Lsx4;->a:Lq82;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lsx4;->a:Lq82;

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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TraversablePrefetchStateModifierElement(prefetchState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lsx4;->a:Lq82;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
