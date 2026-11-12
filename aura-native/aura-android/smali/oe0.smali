.class public final Loe0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lme0;


# instance fields
.field public final n:Lif1;

.field public final o:Lme0;


# direct methods
.method public constructor <init>(Lme0;Lif1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Loe0;->n:Lif1;

    .line 8
    .line 9
    instance-of p2, p1, Loe0;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Loe0;

    .line 14
    .line 15
    iget-object p1, p1, Loe0;->o:Lme0;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Loe0;->o:Lme0;

    .line 18
    .line 19
    return-void
.end method
