.class public final Llg3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvb3;


# instance fields
.field public n:Lvi2;

.field public final o:Lcf2;

.field public final p:Lrp1;


# direct methods
.method public constructor <init>(Lvi2;Lcf2;Lrp1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llg3;->n:Lvi2;

    .line 5
    .line 6
    iput-object p2, p0, Llg3;->o:Lcf2;

    .line 7
    .line 8
    iput-object p3, p0, Llg3;->p:Lrp1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llg3;->o:Lcf2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcf2;->e0()Lq62;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lq62;->f()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
