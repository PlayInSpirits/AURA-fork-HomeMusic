.class public final synthetic Ldt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa0;


# instance fields
.field public final synthetic a:Lit2;

.field public final synthetic b:Ltn2;

.field public final synthetic c:Lfr2;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lit2;Ltn2;Lfr2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldt2;->a:Lit2;

    .line 5
    .line 6
    iput-object p2, p0, Ldt2;->b:Ltn2;

    .line 7
    .line 8
    iput-object p3, p0, Ldt2;->c:Lfr2;

    .line 9
    .line 10
    iput p4, p0, Ldt2;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()Lic2;
    .locals 3

    .line 1
    iget-object v0, p0, Ldt2;->c:Lfr2;

    .line 2
    .line 3
    iget v1, p0, Ldt2;->d:I

    .line 4
    .line 5
    iget-object v2, p0, Ldt2;->a:Lit2;

    .line 6
    .line 7
    iget-object p0, p0, Ldt2;->b:Ltn2;

    .line 8
    .line 9
    invoke-interface {v2, p0, v0, v1}, Lit2;->h(Ltn2;Lfr2;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lic2;

    .line 14
    .line 15
    return-object p0
.end method
