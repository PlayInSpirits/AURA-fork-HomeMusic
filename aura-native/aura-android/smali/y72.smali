.class public final Ly72;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Les;


# instance fields
.field public final synthetic a:Lz72;

.field public final synthetic b:Ljx3;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lz72;Ljx3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly72;->a:Lz72;

    .line 5
    .line 6
    iput-object p2, p0, Ly72;->b:Ljx3;

    .line 7
    .line 8
    iput p3, p0, Ly72;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ly72;->b:Ljx3;

    .line 2
    .line 3
    iget-object v0, v0, Ljx3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lv72;

    .line 6
    .line 7
    iget v1, p0, Ly72;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Ly72;->a:Lz72;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lz72;->q0(Lv72;I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
