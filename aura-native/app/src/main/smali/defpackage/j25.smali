.class public final synthetic Ldefpackage/j25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/j25;->n:I

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/j25;->o:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ldefpackage/j25;->n:I

    .line 7
    .line 8
    iget p0, p0, Ldefpackage/j25;->o:I

    .line 9
    .line 10
    invoke-interface {p1, v0, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 18
    .line 19
    return-object p0
.end method
