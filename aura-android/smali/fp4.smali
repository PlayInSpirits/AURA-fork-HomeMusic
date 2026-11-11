.class public final Lfp4;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Luo;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lfp4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lfp4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p3, p0, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 3

    .line 1
    new-instance v0, Lip4;

    .line 2
    .line 3
    iget-object v1, p0, Lfp4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 6
    .line 7
    iget-object p0, p0, Lfp4;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lip4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 4

    .line 1
    check-cast p1, Lip4;

    .line 2
    .line 3
    iget-object v0, p1, Lip4;->B:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lfp4;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    xor-int/2addr v0, v2

    .line 13
    iput-object v1, p1, Lip4;->B:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, p1, Lip4;->C:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v3, p0, Lfp4;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    :cond_0
    iput-object v3, p1, Lip4;->C:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v1, p1, Lip4;->D:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object p0, p0, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eq v1, v3, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v2, v0

    .line 44
    :goto_0
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Lip4;->r0()V

    .line 47
    .line 48
    .line 49
    :cond_2
    iput-object p0, p1, Lip4;->D:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 50
    .line 51
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lfp4;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lfp4;

    .line 10
    .line 11
    iget-object v0, p1, Lfp4;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lfp4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lfp4;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v1, p1, Lfp4;->b:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-object p0, p0, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 34
    .line 35
    iget-object p1, p1, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 36
    .line 37
    if-ne p0, p1, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lfp4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lfp4;->b:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit16 v0, v0, 0x3c1

    .line 21
    .line 22
    iget-object p0, p0, Lfp4;->c:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method
