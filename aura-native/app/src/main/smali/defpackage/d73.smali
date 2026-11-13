.class public final synthetic Ldefpackage/d73;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/lm0;

.field public final synthetic p:Ldefpackage/gf1;


# direct methods
.method public synthetic constructor <init>(ILdefpackage/lm0;Ldefpackage/gf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/d73;->n:I

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/d73;->o:Ldefpackage/lm0;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/d73;->p:Ldefpackage/gf1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/d73;->o:Ldefpackage/lm0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ad3;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Ldefpackage/d73;->n:I

    .line 8
    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/d73;->p:Ldefpackage/gf1;

    .line 12
    .line 13
    invoke-interface {p0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 17
    .line 18
    return-object p0
.end method
