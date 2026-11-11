.class public final Lqp3;
.super Lex3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final s:Landroidx/recyclerview/widget/RecyclerView;

.field public final t:Ldx3;

.field public final u:Lar;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lex3;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lex3;->r:Ldx3;

    .line 5
    .line 6
    iput-object v0, p0, Lqp3;->t:Ldx3;

    .line 7
    .line 8
    new-instance v0, Lar;

    .line 9
    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {v0, v1, p0}, Lar;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqp3;->u:Lar;

    .line 15
    .line 16
    iput-object p1, p0, Lqp3;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j()Lz2;
    .locals 0

    .line 1
    iget-object p0, p0, Lqp3;->u:Lar;

    .line 2
    .line 3
    return-object p0
.end method
