.class public final Ldefpackage/g71;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Iterator;
.implements Ldefpackage/x32;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/util/Iterator;

.field public p:I

.field public q:Ljava/lang/Object;

.field public final synthetic r:Ldefpackage/aa4;


# direct methods
.method public constructor <init>(Ldefpackage/h71;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/g71;->n:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ldefpackage/g71;->r:Ldefpackage/aa4;

    .line 25
    iget-object p1, p1, Ldefpackage/h71;->a:Ldefpackage/aa4;

    .line 26
    invoke-interface {p1}, Ldefpackage/aa4;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/g71;->o:Ljava/util/Iterator;

    const/4 p1, -0x1

    .line 27
    iput p1, p0, Ldefpackage/g71;->p:I

    return-void
.end method

.method public constructor <init>(Ldefpackage/tq4;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/g71;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/g71;->r:Ldefpackage/aa4;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/tq4;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ldefpackage/aa4;

    .line 12
    .line 13
    invoke-interface {p1}, Ldefpackage/aa4;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ldefpackage/g71;->o:Ljava/util/Iterator;

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Ldefpackage/g71;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/g71;->r:Ldefpackage/aa4;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/h71;

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Ldefpackage/g71;->o:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Ldefpackage/h71;->c:Ldefpackage/if1;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-boolean v3, v0, Ldefpackage/h71;->b:Z

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iput-object v1, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput v0, p0, Ldefpackage/g71;->p:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    iput v0, p0, Ldefpackage/g71;->p:I

    .line 41
    .line 42
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/g71;->o:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Ldefpackage/g71;->r:Ldefpackage/aa4;

    .line 14
    .line 15
    check-cast v1, Ldefpackage/tq4;

    .line 16
    .line 17
    iget-object v1, v1, Ldefpackage/tq4;->c:Ldefpackage/if1;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput v1, p0, Ldefpackage/g71;->p:I

    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    iput v0, p0, Ldefpackage/g71;->p:I

    .line 39
    .line 40
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/g71;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/g71;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget p0, p0, Ldefpackage/g71;->p:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/g71;->a()V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget p0, p0, Ldefpackage/g71;->p:I

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    if-ne p0, v0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    const/4 v0, 0x0

    .line 37
    :goto_1
    return v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/g71;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/g71;->b()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 22
    .line 23
    iput v1, p0, Ldefpackage/g71;->p:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    return-object v0

    .line 31
    :pswitch_0
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 32
    .line 33
    const/4 v1, -0x1

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Ldefpackage/g71;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v0, p0, Ldefpackage/g71;->p:I

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    iput-object v2, p0, Ldefpackage/g71;->q:Ljava/lang/Object;

    .line 47
    .line 48
    iput v1, p0, Ldefpackage/g71;->p:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    :goto_1
    return-object v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/g71;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
