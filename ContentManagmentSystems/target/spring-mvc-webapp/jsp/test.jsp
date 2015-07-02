<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head style="background-color: orange">
        <title>Index Page</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body >




        <div id="post1"class="well">
            <h3 id="title"></h3>
            <p id="textBody"></p>
        </div>
        <div class="well">
            <h3>Test Post 2: Est, ut dicis, inquam.</h3>

            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. <i>Quacumque enim ingredimur, in aliqua historia 
                    vestigium ponimus.</i> Duo Reges: constructio interrete. Non pugnem cum homine, cur tantum habeat in 
                natura boni; Atqui, inquam, Cato, si istud optinueris, traducas me ad te totum licebit. Virtutibus igitur rectissime 
                mihi videris et ad consuetudinem nostrae orationis vitia posuisse contraria. <b>Aliter autem vobis placet.</b> </p>

            <p>Videsne quam sit magna dissensio? Sed tamen intellego quid velit. Omnia contraria, quos etiam insanos esse 
                vultis. Sed ut iis bonis erigimur, quae expectamus, sic laetamur iis, quae recordamur. Sed virtutem ipsam inchoavit, 
                nihil amplius. Summus dolor plures dies manere non potest? <i>Tria genera bonorum;</i> Frater et T. </p>

            <dl>
                <dt><dfn>Quid iudicant sensus?</dfn></dt>
                <dd>Quo studio Aristophanem putamus aetatem in litteris duxisse?</dd>
                <dt><dfn>Quid vero?</dfn></dt>
                <dd>Ne vitationem quidem doloris ipsam per se quisquam in rebus expetendis putavit, nisi etiam evitare posset.</dd>
                <dt><dfn>Quis istum dolorem timet?</dfn></dt>
                <dd>Nescio quo modo praetervolavit oratio.</dd>
                <dt><dfn>Nulla erit controversia.</dfn></dt>
                <dd>Nihilne te delectat umquam -video, quicum loquar-, te igitur, Torquate, ipsum per se nihil delectat?</dd>
            </dl>
        </div>
        <div class="well">
            <h3>Test Post 3</h3>
            <ol>
                <li>At iam decimum annum in spelunca iacet.</li>
                <li>Praeterea et appetendi et refugiendi et omnino rerum gerendarum initia proficiscuntur aut a voluptate aut a dolore.</li>
            </ol>
            <p><b>Immo alio genere;</b> Atqui iste locus est, Piso, tibi etiam atque etiam confirmandus, inquam; 
                <a href='http://loripsum.net/' target='_blank'>Aliter homines, aliter philosophos loqui putas oportere?</a> An me, 
                inquam, nisi te audire vellem, censes haec dicturum fuisse? Quamquam ab iis philosophiam et omnes ingenuas 
                disciplinas habemus; <b>Pollicetur certe.</b> <a href='http://loripsum.net/' target='_blank'>Quid ergo attinet gloriose 
                    loqui, nisi constanter loquare?</a> <b>Quis istud possit, inquit, negare?</b> Ne tum quidem te respicies et cogitabis 
                sibi quemque natum esse et suis voluptatibus? Quibus ego vehementer assentior. </p>
            <ul>
                <li>Atqui, inquam, Cato, si istud optinueris, traducas me ad te totum licebit.</li>
                <li>Qui igitur convenit ab alia voluptate dicere naturam proficisci, in alia summum bonum ponere?</li>
                <li>Tu autem negas fortem esse quemquam posse, qui dolorem malum putet.</li>
                <li>Sed tamen enitar et, si minus multa mihi occurrent, non fugiam ista popularia.</li>
                <li>Aliter homines, aliter philosophos loqui putas oportere?</li>
                <li>Minime vero istorum quidem, inquit.</li>
            </ul>

        </div>
        <div class="well">
            <h3>Test Post 4: Quod dicit Epicurus</h3>

            <p><a href='http://loripsum.net/' target='_blank'>Omnia peccata paria dicitis.</a> Occultum facinus esse potuerit, 
                gaudebit; Videamus animi partes, quarum est conspectus illustrior; Illa sunt similia: hebes acies est cuipiam oculorum, 
                corpore alius senescit; Sed haec quidem liberius ab eo dicuntur et saepius. Quis non odit sordidos, vanos, leves, futtiles?
                Homines optimi non intellegunt totam rationem everti, si ita res se habeat. </p>

            <h2>Sint ista Graecorum;</h2>

            <p>Te enim iudicem aequum puto, modo quae dicat ille bene noris. <b>Nihil sane.</b> In his igitur partibus 
                duabus nihil erat, quod Zeno commutare gestiret. Primum in nostrane potestate est, quid meminerimus? 
                <b>Praeteritis, inquit, gaudeo.</b> </p>
        </div>

       
    
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/ContentManagment.js"></script>

</body>
</html>

