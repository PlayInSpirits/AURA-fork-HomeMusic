.class public final Ldw2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lnt2;


# instance fields
.field public final a:Lrm2;

.field public final b:Lgj0;

.field public c:Z

.field public final synthetic d:Lew2;


# direct methods
.method public constructor <init>(Lew2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldw2;->d:Lew2;

    .line 5
    .line 6
    new-instance p1, Lrm2;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p1, v0, p0}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldw2;->a:Lrm2;

    .line 13
    .line 14
    new-instance p1, Lgj0;

    .line 15
    .line 16
    invoke-direct {p1}, Lgj0;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldw2;->b:Lgj0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lbq;Lcu4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldw2;->d:Lew2;

    .line 2
    .line 3
    iput-object p2, v0, Lew2;->q:Lcu4;

    .line 4
    .line 5
    iget-boolean v1, p0, Ldw2;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, Ldw2;->c:Z

    .line 12
    .line 13
    new-instance v1, Lmt2;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p2, v2}, Lcu4;->l(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {v1, p2}, Lmt2;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Ldw2;->b:Lgj0;

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    invoke-virtual {p1, v1, p2, v2, v3}, Lbq;->b(Lmt2;Ln9;J)Lno2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, v0, Lew2;->p:Lno2;

    .line 32
    .line 33
    iget-object p0, p0, Ldw2;->a:Lrm2;

    .line 34
    .line 35
    invoke-interface {p1, p0, v2, v3}, Lno2;->m(Lmo2;J)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
