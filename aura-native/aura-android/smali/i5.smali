.class public final Li5;
.super Ljava/lang/ref/WeakReference;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lf42;

.field public final b:Z

.field public c:Lq04;


# direct methods
.method public constructor <init>(Lf42;Lo11;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, p3}, Lh12;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li5;->a:Lf42;

    .line 10
    .line 11
    iget-boolean p1, p2, Lo11;->n:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Li5;->c:Lq04;

    .line 15
    .line 16
    iput-boolean p1, p0, Li5;->b:Z

    .line 17
    .line 18
    return-void
.end method
