.class public final Lxa;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq94;


# instance fields
.field public n:Z

.field public final synthetic o:Lac4;


# direct methods
.method public constructor <init>(Lac4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa;->o:Lac4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lp94;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lxa;->o:Lac4;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lxa;->n:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
